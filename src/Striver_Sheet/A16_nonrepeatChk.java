package Striver_Sheet;
import java.util.*;

public class A16_nonrepeatChk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }
        sc.close();
    }
}