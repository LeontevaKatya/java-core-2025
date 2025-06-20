package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите Ваш год рождения: ");
        int yearBorn = Integer.parseInt(in.nextLine());

        int currentYear = 2025; // Год фиксируется как 2025-й
        int age = currentYear - yearBorn;

        System.out.printf("%s, Вам %d лет.", name, age);

        in.close();
    }
}

