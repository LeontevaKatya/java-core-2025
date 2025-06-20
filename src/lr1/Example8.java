package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий день недели:");
        String dayweek = in.nextLine();
        System.out.println("Введите текущий месяц:");
        String month = in.nextLine();
        System.out.println("Введите сегодняшнее число:");
        int data = in.nextInt();

        if (month.endsWith("ь") || month.endsWith("й")) {
            month = month.substring(0, month.length() - 1) + "я";
        } else {
            month = month + "а";
        }

        System.out.println("Дата:" + dayweek + ", " + data + " " + month);
        in.close();
    }
}

