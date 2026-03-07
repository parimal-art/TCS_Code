// Remove Duplicates in place from a sorted array

package Striver_Sheet;

import java.util.Scanner;

public class A11_removeDuplicates {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        int i = 0;
        for(int j = 1; j < n; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        int k = i + 1;
        for(int x = 0; x < k; x++){
            System.out.print(nums[x] + " ");
        }
        System.out.println();
        System.out.println(k);

        sc.close();
    }
}
