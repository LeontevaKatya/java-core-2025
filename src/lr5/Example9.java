package lr5;
import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static List<String> filterAlphaStrings(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (string.matches("[a-zA-Z]+")) {
                result.add(string);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world123", "Java?");
        System.out.println(filterAlphaStrings(list));
    }
}

