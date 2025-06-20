package lr1;

import java.util.Scanner;

public class Example10  {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите ваш год рождения: ");
            int birthYear = in.nextInt();
            int currentYear = 2025; // Текущий год фиксирован для примера
            int age = currentYear - birthYear;
            System.out.println("Ваш возраст: " + age + " лет");
            in.close();
        }
}
