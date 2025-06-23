package lr5;
import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static List<Integer> filterDivisible(List<Integer> numbers, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % divisor == 0){
                result.add(number);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 33, 40, 45, 55);
        int divisor = 3;
        System.out.println(filterDivisible(list, divisor));
    }
}

