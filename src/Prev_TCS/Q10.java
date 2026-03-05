// Chatgpt can you explain the code question??
package Prev_TCS;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();

            for(int i=0;i<n;i++){
                sc.nextInt();
                sc.nextInt();
                sc.nextInt();
            }

            if(n % 2 != 0){
                System.out.println("First Player");
                System.out.println(1);
            }
            else{
                System.out.println("No winning move");
                System.out.println("Second Player");
            }
        }
    }
}
