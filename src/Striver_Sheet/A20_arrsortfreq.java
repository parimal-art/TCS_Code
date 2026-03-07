package Striver_Sheet;
import java.util.*;
public class A20_arrsortfreq {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = input.length;

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            list.add(num);
        }

        Collections.sort(list,(a,b)->{

            int f1 = freq.get(a);
            int f2 = freq.get(b);

            if(f1 != f2)
                return f2 - f1;

            return a - b;
        });

        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
