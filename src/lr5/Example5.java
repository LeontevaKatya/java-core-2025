package lr5;
import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static List<String> filterStringsBySubstring(List<String> strings, String substring) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.contains(substring)) {
                result.add(str);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> input = List.of("car", "bus", "bicycle");
        String subStr = "c";

        System.out.println(filterStringsBySubstring(input, subStr));
    }
}
