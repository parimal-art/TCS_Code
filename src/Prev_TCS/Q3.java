package Prev_TCS;
import java.util.Scanner;
public class Q3 {
    // function to classify temperature
    public static String classify(int temp) {

        if (temp < 10) {
            return "it's very cool";
        }
        else if (temp <= 20) {
            return "it's cold";
        }
        else {
            return "it's warm";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split(" ");

        int t1 = Integer.parseInt(arr[0]);
        int t2 = Integer.parseInt(arr[1]);

        // classification
        System.out.println(classify(t1));
        System.out.println(classify(t2));

        // average
        double avg = (t1 + t2) / 2.0;
        System.out.println(avg);

        // reverse order
        System.out.println(t2 + " " + t1);
    }
}
