package introduction_to_recursion;
import java.util.*;

public class power_logarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xpn = power(x, n);
        System.out.println(xpn);
    }

    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        int xpb2 = power(x, n / 2);
        int xpn = xpb2 * xpb2;
        if (n % 2 == 1) {
            xpn = xpn * x;
        }
        return xpn;
    }

}
/* 
input -
2
5
output-
32
*/