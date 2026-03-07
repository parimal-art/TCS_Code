package Striver_Sheet;
import java.util.*;
public class N1_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();   // input as string

        int left = 0;
        int right = n.length() - 1;

        boolean isPalindrome = true;

        while(left < right){
            if(n.charAt(left) != n.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrome){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
