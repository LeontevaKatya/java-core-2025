package timus;
import java.util.Scanner;

public class lr5_timys1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int[] arrivals = new int[n];
        for (int i = 0; i < n; i++) {
            arrivals[i] = in.nextInt();
        }
        int currentQueue = 0;
        for (int i = 0; i < n; i++) {
            currentQueue += arrivals[i];
            currentQueue -= Math.min(currentQueue, k);
        }
        System.out.println(currentQueue);
    }
}
