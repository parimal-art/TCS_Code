package Prev_TCS;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        // input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print according to rule
        for (int i = 0; i < m; i++) {

            if (i % 2 == 0) { // even row → left to right
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else { // odd row → right to left
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
