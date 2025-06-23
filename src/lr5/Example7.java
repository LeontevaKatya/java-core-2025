package lr5;
import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static List<String> filterLongerStrings(List<String> strings, int minLength) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > minLength) { // Проверяем длину строки
                result.add(string);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> list = List.of("car", "bus", "bicycle");
        int minLength = 5;
        System.out.println(filterLongerStrings(list, minLength));
    }
}
