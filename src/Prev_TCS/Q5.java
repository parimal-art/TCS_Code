package Prev_TCS;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long moves = (long)Math.pow(2, n) - 1;

        System.out.println(moves);
    }
}
