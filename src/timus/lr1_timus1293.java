package timus;
import java.util.Scanner;

public class lr1_timus1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int totalSulfide = N * 2 * A * B;

        System.out.println(totalSulfide);
    }
}

