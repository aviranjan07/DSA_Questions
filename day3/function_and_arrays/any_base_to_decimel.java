import java.util.*;

public class any_base_to_decimel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueInDecimel(n, b);
        System.out.println(d);

    }
    public static int getValueInDecimel (int n, int b) {
       
         int dn = 0;
         int bp = 1;
         while (n > 0) {
             int rem = n % 10;
             n = n / 10;

             dn = dn + rem * bp;
             bp = bp * b;
         }
    return dn;
    }
}
/*
input- 
111001
2
output-
57
*/
