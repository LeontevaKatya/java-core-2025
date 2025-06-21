package timus;
import java.util.Scanner;

public class lr2_timys1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Сообщение пользователю о вводе данных
        System.out.print("Введите размер массива и максимальный индекс: ");
        // Читаем размеры массива и максимальный индекс
        int N = in.nextInt(); // Размер массива
        int M = in.nextInt(); // Верхняя граница индекса

        // Вычисляем количество строк кода
        long seconds = (long) N * (M + 1);

        // Выводим результат
        System.out.println("Потребуется " + seconds + " секунд.");
    }
}

