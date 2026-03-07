package Striver_Sheet;
import java.util.*;
public class N1_2Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();   // input as string
        int n = Integer.parseInt(input); // convert string to int

        int original = n;
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if(original == reverse){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
