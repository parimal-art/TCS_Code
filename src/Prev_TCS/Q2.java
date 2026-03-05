package Prev_TCS;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        // validation
        if (m <= 0 || n <= 0) {
            System.out.println("invalid input");
            return;
        }

        int min = Integer.MAX_VALUE;

        // reading matrix and finding minimum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int num = sc.nextInt();

                if (num < min) {
                    min = num;
                }
            }
        }

        System.out.println(min);
    }
}
