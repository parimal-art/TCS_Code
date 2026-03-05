package Striver_Sheet;
import java.util.Scanner;
import java.util.Arrays;
public class A6_incdec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;

        int[] nums = new int[n];

        for(int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(arr[i]);

        Arrays.sort(nums);

        int mid = n / 2;

        // first half ascending
        for(int i = 0; i < mid; i++)
            System.out.print(nums[i] + " ");

        // second half descending
        for(int i = n - 1; i >= mid; i--)
            System.out.print(nums[i] + " ");
    }
}
