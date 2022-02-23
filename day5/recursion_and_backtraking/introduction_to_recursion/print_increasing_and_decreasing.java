package introduction_to_recursion;
import java.util.*;

public class print_increasing_and_decreasing {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);

    }

    public static void pdi(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
        
    }

}
/* 
input- 
3
output-
3
2
1
1
2
3
*/