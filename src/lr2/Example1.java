package lr2;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_SIZE = 10;
        int[] numbers = new int[ARRAY_SIZE];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.print("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        int minValue = Integer.MAX_VALUE;
        boolean firstFound = false;
        StringBuilder indices = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                indices.setLength(0);
                indices.append(i);
                firstFound = true;
            } else if (firstFound && numbers[i] == minValue) {
                indices.append(", ").append(i);
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Индекс(ы) минимальных значений: " + indices);
    }
}

