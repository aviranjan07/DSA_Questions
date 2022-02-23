package introduction_to_recursion;
import java.util.*;

public class power_linear {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xpn = power(x, n);
        System.out.println(xpn);
    }

    public static int power(int x, int n){
        if(n == 0) {
            return 1;
        }
        int nm1p =  power(x, n -1 );
        int xpn = nm1p * x;
        return xpn;
    }

}
/* 
input-
2
5
output-
32
*/