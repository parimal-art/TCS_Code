package Striver_Sheet;
import java.util.*;
public class A12_unsortedSorting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        Set<Integer> set = new LinkedHashSet<>();

        for(String s : input){
            set.add(Integer.parseInt(s));
        }

        for(int num : set){
            System.out.print(num + " ");
        }
    }
}
