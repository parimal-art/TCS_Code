package Prev_TCS;
import java.util.Scanner;
import java.util.HashMap;
public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] < 0) {
                System.out.println("invalid");
                return;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n-1; i++) {

            int diff = Math.abs(arr[i+1] - arr[i]);

            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }

        int maxFreq = 0;
        int result = -1;

        for(int key : map.keySet()) {

            int freq = map.get(key);

            if(freq > maxFreq) {
                maxFreq = freq;
                result = key;
            }
        }

        if(maxFreq <= 1)
            System.out.println("non");
        else
            System.out.println(result);
    }
}
