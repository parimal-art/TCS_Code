package Prev_TCS;
import java.util.*;
public class Q1 {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Function to find nth prime
    public static int nthPrime(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;

            if (isPrime(num)) {
                count++;
            }
        }

        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input as string
        String input = sc.nextLine();

        String[] arr = input.split(" ");

        int X = Integer.parseInt(arr[0]);
        int Y = Integer.parseInt(arr[1]);

        int A = nthPrime(X);
        int B = nthPrime(Y);

        int C = (A + B) - 1;

        System.out.println(C);
    }
}
