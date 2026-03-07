package Striver_Sheet;

import java.util.Scanner;

public class A18_maxproductSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;

        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for(int i = 1; i < n; i++){

            int num = nums[i];

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

        sc.close();
    }
}