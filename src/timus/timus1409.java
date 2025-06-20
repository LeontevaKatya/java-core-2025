package timus;
import java.util.Scanner;

public class timus1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Читаем количество банок, простреленных Гарри и Ларри
        int harryShot = in.nextInt();
        int larryShot = in.nextInt();

        // Рассчитываем количество непростреленных банок
        int remainingForHarry = larryShot - 1;
        int remainingForLarry = harryShot - 1;

        // Выводим результат
        System.out.println(remainingForHarry + " " + remainingForLarry);
    }
}