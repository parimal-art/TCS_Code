package Striver_Sheet;

import java.util.*;

public class A18_maxproductSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = input.length;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];

        for(int i = 1; i < n; i++){

            int num = arr[i];

            if(num < 0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);

            result = Math.max(result, maxProd);
        }

        System.out.println(result);
    }
}