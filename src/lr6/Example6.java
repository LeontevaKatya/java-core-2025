package lr6;
import java.util.concurrent.CountDownLatch;

public class Example6 {
    static class SumTask implements Runnable {
        private final int[] array;
        private final int start;
        private final int end;
        private long partialSum;
        private final CountDownLatch latch;
        public SumTask(int[] array, int start, int end, CountDownLatch latch) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.latch = latch;
        }
        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                partialSum += array[i];
            }
            latch.countDown();
        }
        public long getPartialSum() {
            return partialSum;
        }
    }
    public static long parallelSum(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        CountDownLatch latch = new CountDownLatch(cores);
        SumTask[] tasks = new SumTask[cores];
        long totalSum = 0L;
        int segmentSize = (int) Math.ceil((double) array.length / cores);
        // Запускаем потоки
        for (int i = 0; i < cores; i++) {
            int start = i * segmentSize;
            int end = Math.min(start + segmentSize, array.length);
            tasks[i] = new SumTask(array, start, end, latch);
            new Thread(tasks[i]).start();
        }
        // Ждём завершения всех потоков
        latch.await();
        for (SumTask task : tasks) {
            totalSum += task.getPartialSum();
        }
        return totalSum;
    }
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[5_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1;
        }
        long sum = parallelSum(numbers);
        System.out.println("Сумма элементов массива: " + sum);
    }
}