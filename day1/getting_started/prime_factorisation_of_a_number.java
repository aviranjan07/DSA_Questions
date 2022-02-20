package getting_started;
import java.util.*;

public class prime_factorisation_of_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int f = 2; f * f <= n; f++) {
            while (n % f == 0) {
                System.out.print(f + " ");
                n = n / f;
            }
        }
        if(n > 1){
            System.out.print(n);
        }
    }
}
