//need to explain the code
package Striver_Sheet;
import java.util.*;
public class A5_arrFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for(String s : arr){

            int num = Integer.parseInt(s);

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
