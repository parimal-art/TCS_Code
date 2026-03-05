package Striver_Sheet;
import java.util.Scanner;
public class A11_inplaceSorting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = input.length;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int i = 0;

        for(int j = 1; j < n; j++){

            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        int k = i + 1;

        for(int x = 0; x < k; x++){
            System.out.print(arr[x] + " ");
        }

        System.out.println();
        System.out.println(k);
    }
}
