package Prev_TCS;
import java.util.Scanner;

public class Q1 {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
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
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        int X = nums[0];
        int Y = nums[1];

        int A = nthPrime(X);
        int B = nthPrime(Y);

        int C = (A + B) - 1;

        System.out.println(C);
        sc.close();
    }
}