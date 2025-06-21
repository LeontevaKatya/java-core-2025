package timus;
import java.io.PrintWriter;
import java.util.Scanner;

public class lr2_timys1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        // Просим пользователя ввести коды
        System.out.print("Введите код 1: ");
        int code1 = in.nextInt();

        System.out.print("Введите код 2: ");
        int code2 = in.nextInt();

        if (code1 % 2 == 0 || code2 % 2 != 0) {
            System.out.println("yes");
        } else { System.out.println("no");
        }
    }
}