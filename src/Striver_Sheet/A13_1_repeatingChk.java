package Striver_Sheet;
import java.util.Scanner;
import java.util.Arrays;

public class A13_1_repeatingChk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums);
        System.out.print("Repeating elements: ");
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                System.out.print(nums[i] + " ");
                while(i < n - 1 && nums[i] == nums[i + 1]){
                    i++;
                }
            }
        }

        sc.close();
    }
}