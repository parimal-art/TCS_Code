package Striver_Sheet;
import java.util.*;
public class A12_unsortedSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        for(Integer num : set){
            System.out.print(num + " ");
        }
        sc.close();
    }
}