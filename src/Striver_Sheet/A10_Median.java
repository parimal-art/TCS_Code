package Striver_Sheet;
import java.util.Scanner;
import java.util.Arrays;
public class A10_Median {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = input.length;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        if(n % 2 == 1){
            System.out.println(arr[n/2]);
        }
        else{
            double median = (arr[n/2] + arr[n/2 - 1]) / 2.0;
            System.out.println(median);
        }
    }
}
