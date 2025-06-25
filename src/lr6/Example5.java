package lr6;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {5, 12, 7, 3, 25, 99, 4, 56, 78, 101, 66, 23};
        int maxValue = findMaxParallel(array);
        System.out.println("Максимальный элемент: " + maxValue);
    }
    private static class FindMaxTask implements Runnable {
        private final int[] array;
        private final int fromIndex;
        private final int toIndex;
        private final Integer[] results;
        private final int index;
        private final CountDownLatch latch;
        public FindMaxTask(int[] array, int fromIndex, int toIndex, Integer[] results, int index, CountDownLatch latch) {
            this.array = array;
            this.fromIndex = fromIndex;
            this.toIndex = toIndex;
            this.results = results;
            this.index = index;
            this.latch = latch;
        }
        @Override
        public void run() {
            try {
                results[index] = Arrays.stream(Arrays.copyOfRange(array, fromIndex, toIndex)).max().orElse(Integer.MIN_VALUE);
            } finally {
                latch.countDown();
            }
        }
    }
    private static int findMaxParallel(int[] arr) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors(); // кол-во ядер процессора
        int chunkSize = Math.max(2, arr.length / cores); // размер блока для каждого потока
        CountDownLatch latch = new CountDownLatch(cores); // считаем завершение всех потоков
        Integer[] results = new Integer[cores]; // хранилище результатов от каждого потока
        for (int i = 0; i < cores; i++) {
            int fromIndex = i * chunkSize;
            int toIndex = Math.min(fromIndex + chunkSize, arr.length);
            Thread thread = new Thread(new FindMaxTask(arr, fromIndex, toIndex, results, i, latch));
            thread.start();
        }
        latch.await();

        return Arrays.stream(results).mapToInt(i -> i != null ? i : Integer.MIN_VALUE).max().orElse(Integer.MIN_VALUE);
    }
}