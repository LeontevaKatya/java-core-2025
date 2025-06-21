package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = in.nextInt();
        int[][] array = new int[rows][cols];
        int num = 1;
        // Заполнение массива по схеме "змейки"
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Заполняем строку слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = num++;
                }
            } else {
                // Заполняем строку справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = num++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
