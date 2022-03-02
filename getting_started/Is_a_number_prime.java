package getting_started;
import java.util.*;

public class Is_a_number_prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for(int i = 1; i <= t; i++) {
            int x = scn.nextInt();
 
            boolean isPrime = true;
            int div = 2;
            while (div * div <= x) {
                int r = x % div;

                if(r == 0){
                   isPrime = false;
                   break;
                }
                div++;
            }
            if (isPrime == true){
                System.out.println("prime");

            }else {
                System.out.println("not prime");
            }
        }
    }
}
/*
simple input-
5
13
2
3
4
5
*/