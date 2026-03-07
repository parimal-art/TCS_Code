package Striver_Sheet;
import java.util.*;
public class A19_arrsortRank {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = input.length;

        int[] arr = new int[n];
        int[] temp = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input[i]);
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();

        int rank = 1;

        for(int num : temp){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }

        for(int num : arr){
            System.out.print(map.get(num) + " ");
        }
    }
}
