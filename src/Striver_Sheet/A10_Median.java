package Striver_Sheet;
import java.util.Scanner;
import java.util.Arrays;

public class A10_Median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums);
        if(n % 2 == 1){
            System.out.println(nums[n/2]);
        }
        else{
            double median = (nums[n/2] + nums[n/2 - 1]) / 2.0;
            System.out.println(median);
        }
        sc.close();
    }
}