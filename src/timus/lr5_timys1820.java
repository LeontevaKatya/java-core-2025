package timus;
import java.util.Scanner;

public class lr5_timys1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int result = (2 * n + k - 1) / k;
        System.out.println(result);
    }
}
