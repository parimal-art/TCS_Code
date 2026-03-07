package Striver_Sheet;
import java.util.Scanner;
public class N5_Armstrong {
    public static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;
        int digits = 0;

        int temp = n;

        // count digits
        while(temp > 0){
            digits++;
            temp = temp / 10;
        }

        temp = n;

        // calculate sum of powers
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isArmstrong(n)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
