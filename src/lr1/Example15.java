package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNum = Double.parseDouble(in.nextLine());

        System.out.print("Введите второе число: ");
        double secondNum = Double.parseDouble(in.nextLine());

        double sum = firstNum + secondNum;
        double diff = firstNum - secondNum;

        System.out.printf("Сумма чисел: %.2f\n", sum);
        System.out.printf("Разность чисел: %.2f", diff);

        in.close();
    }
}

