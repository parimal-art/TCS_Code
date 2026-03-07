package Striver_Sheet;
import java.util.Scanner;
public class A2_2ndminmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        if (n < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            sc.close();
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            // find smallest & second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
            // find largest & second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondSmallest == Integer.MAX_VALUE)
            secondSmallest = -1;
        if (secondLargest == Integer.MIN_VALUE)
            secondLargest = -1;
        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
        sc.close();
    }
}