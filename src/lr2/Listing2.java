package lr2;

import java.util.Scanner;

public class Listing2 {
    public static String getEncryptstring(String encryptString, int shift) {

        char[] arrayChar = encryptString. toCharArray();
        long[] arrayInt = new long[arrayChar. length];
        char[] arrayCharNew = new char[arrayChar. length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);
        return encryptString;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ваша строка: ");
        String original = in.nextLine();
        System.out.println("Сдвиг: ");
        int shift = in.nextInt();
        String encrypted = Listing2.getEncryptstring(original, shift);
        System.out.println("Исходная фраза: " + original);
        System.out.println("Шифровка (сдвиг=" + shift + "): " + encrypted);
    }
}