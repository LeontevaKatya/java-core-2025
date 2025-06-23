package lr5;
import java.util.ArrayList;
import java.util.List;

public class Example8 {
    public static List<Integer> filterLargerNumbers(List<Integer> numbers, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > threshold) {
                result.add(number);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 10, 15);
        int threshold = 5;
        System.out.println(filterLargerNumbers(list, threshold));
    }
}

