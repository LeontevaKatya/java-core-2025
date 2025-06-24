package timus;
import java.util.Scanner;

public class lr6_timus1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nTests = Integer.parseInt(in.nextLine());
        while (nTests-- > 0) {
            String position = in.nextLine();
            char letter = position.charAt(0);     // Буква
            char digit = position.charAt(1);      // Цифра
            // Преобразуем символы в индексы
            int column = letter - 'a';
            int row = Character.digit(digit, 10) - 1;
            // Вычисляем количество атакующих полей
            int attacksCount = calculateKnightAttacks(column, row);
            System.out.println(attacksCount);
        }
    }
    private static int calculateKnightAttacks(int column, int row) {
        int[][] possibleMoves = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1},
                {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
        int validMoves = 0;
        for (int[] move : possibleMoves) {
            int nextColumn = column + move[0];
            int nextRow = row + move[1];
            if (nextColumn >= 0 && nextColumn < 8 &&
                    nextRow >= 0 && nextRow < 8) {
                validMoves++;
            }
        }
        return validMoves;
    }
}

