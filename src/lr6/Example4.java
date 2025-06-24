package lr6;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Thread(() -> System.out.println("Поток #" + Thread.currentThread().getName())).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
