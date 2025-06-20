import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class timus1001{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        while (in.hasNext()) {
            numbers.add(in.nextLong());
        }

        in.close();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            long currentNumber = numbers.get(i);
            double sqrtValue = Math.sqrt(currentNumber);

            System.out.printf("%.4f\n", sqrtValue);
        }
    }
}