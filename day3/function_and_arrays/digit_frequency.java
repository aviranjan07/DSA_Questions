import java.util.*;

public class digit_frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = digitFrequency(n, d);
        System.out.println(f);

    }
    public static int digitFrequency(int n , int d) {
        int f = 0;
        while( n > 0) {
            int rem = n % 10;
             n = n / 10;

             if( rem == d) {
                 f++;
             }
        }
        return f;
    }
}
/*
input  
89999
9
output
4
*/