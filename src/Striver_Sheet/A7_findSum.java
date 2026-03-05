package Striver_Sheet;
import java.util.Scanner;
public class A7_findSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        int sum = 0;

        for(String s : arr){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }
}
