package Striver_Sheet;
import java.util.Scanner;
public class A1_minArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int min = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            int num = Integer.parseInt(arr[i]);

            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
    }
}
