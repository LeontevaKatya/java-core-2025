package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String monthName =in .nextLine();
        System.out.print("Введите количество дней в месяце: ");
        int daysCount = in.nextInt();
        String wordDay = getWordDay(daysCount);
        System.out.println(monthName + " содержит " + daysCount + " " + wordDay);
        in.close();
    }
    private static String getWordDay(int days) {
        return (days % 10 == 1 && days % 100 != 11) ? "день" :
                (days % 10 >= 2 && days % 10 <= 4 && (days % 100 < 10 || days % 100 >= 20)) ? "дня" : "дней";
    }
}
