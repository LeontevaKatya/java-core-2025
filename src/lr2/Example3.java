package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine();
        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.print("Выполнить обратное преобразование? (y/n): ");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = encrypt(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
        in.close();
    }
    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) (base + (c - base + key + 26) % 26);
            }
            result.append(c);
        }
        return result.toString();
    }
}

