import java.util.*;
public class print_fibonacci_numbers_till_N {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        int a = 0;
        int b = 1;
        for ( int i = 0; i <= x; i++) {
            int c = a + b;
            System.out.println(a);

            a = b;
            b = c;
        }
    }
}

// input-
// 12