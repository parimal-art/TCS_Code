package Striver_Sheet;
import java.util.*;
public class A13_repeatingChk {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        HashMap<Integer,Integer> map = new HashMap<>();

        for(String s : input){

            int num = Integer.parseInt(s);

            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            if(entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
