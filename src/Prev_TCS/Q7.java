package Prev_TCS;
import java.util.Scanner;
import java.util.HashMap;
public class Q7 {
    static long fact(int n){
        long f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        long ans = fact(n);

        for(int freq : map.values()){
            ans /= fact(freq);
        }

        System.out.println(ans);
    }
}
