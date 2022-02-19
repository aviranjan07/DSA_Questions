import java.util.*;

public class count_digits_in_a_number {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int dig = 0;
        while(n != 0) {
            int q = n / 10;
            int r = n % 10;
            dig++;
            n = q;
        }
        System.out.println(dig);
    }
}

// input- 
// 12345