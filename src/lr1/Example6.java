package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваша фамилия: ");
        String lastname = in.nextLine();
        System.out.println("Ваше имя: ");
        String name = in.nextLine();
        System.out.println("Ваше отчество: ");
        String patronymic = in.nextLine();
        System.out.println("Hello: " + lastname + " " + name + " " + patronymic);
        in.close();
    }
}
