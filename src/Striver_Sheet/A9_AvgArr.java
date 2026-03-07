package Striver_Sheet;
import java.util.Scanner;

public class A9_AvgArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        double avg = (double) sum / n;
        System.out.println(avg);
        sc.close();
    }
}