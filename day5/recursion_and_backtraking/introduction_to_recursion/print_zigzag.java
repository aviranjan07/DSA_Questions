package introduction_to_recursion;
import java.util.*;

public class print_zigzag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");


        
    }

}
/* 
input-
3
output-
3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
*/