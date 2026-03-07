package Striver_Sheet;
import java.util.*;
public class N2_PalindromeRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i = min; i <= max; i++){
            int num = i;
            int original = i;
            int reverse = 0;

            while(num > 0){
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            if(original == reverse){
                System.out.print(original + " ");
            }
        }
    }
}
