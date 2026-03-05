package Prev_TCS;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int n = arr.length;

        double sum = 0;

        for(int i=0;i<n;i++){
            sum += Integer.parseInt(arr[i]);
        }

        double mean = sum / n;

        double variance = 0;

        for(int i=0;i<n;i++){
            double num = Integer.parseInt(arr[i]);
            variance += Math.pow(num - mean, 2);
        }

        variance = variance / n;

        double sd = Math.sqrt(variance);

        System.out.printf("%.2f", sd);
    }
}
