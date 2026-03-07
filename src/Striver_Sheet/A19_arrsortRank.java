package Striver_Sheet;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class A19_arrsortRank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;

        int[] nums = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
            temp[i] = nums[i];
        }

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(map.get(nums[i]) + " ");
        }

        sc.close();
    }
}