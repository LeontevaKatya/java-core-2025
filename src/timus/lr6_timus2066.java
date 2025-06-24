package timus;
import java.util.*;

public class lr6_timus2066 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    // Рассматриваем все возможные варианты выражений
    List<Integer> results = new ArrayList<>();
    results.add(a + b + c);
    results.add(a - b - c);
    results.add(a * b * c);

    results.add(a + b * c);
    results.add(a + b - c);
    results.add(a - b * c);
    results.add(a - b + c);
    results.add(a * b + c);
    results.add(a * b - c);
    // Находим минимальное значение
    int minResult = Collections.min(results);

    System.out.println(minResult);
    }
}
