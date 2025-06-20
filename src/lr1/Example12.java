package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите Ваш возраст: ");
        int age = Integer.parseInt(in.nextLine());

        int currentYear = 2025; // Год фиксируется как 2025-й
        int birthYear = currentYear - age;

        System.out.printf("Вы родились в %d году", birthYear);

        in.close();
    }
}

