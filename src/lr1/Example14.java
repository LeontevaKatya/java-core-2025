package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = Integer.parseInt(in.nextLine());

        int previous = num - 1;
        int next = num + 1;
        int sumSquare = (previous + num + next) * (previous + num + next); // Сумма квадратов

        System.out.printf("Последовательность: %d, %d, %d, %d", previous, num, next, sumSquare);

        in.close();
    }
}

