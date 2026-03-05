package Prev_TCS;
import java.util.Arrays;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
            return;
        }

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
