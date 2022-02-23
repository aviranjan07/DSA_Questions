package introduction_to_recursion;
import java.util.*;

public class tower_of_hanoi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();
        toh(n, t1id, t2id, t3id);
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if (n == 0) {
            return;
        }
           toh(n - 1, t1id, t3id, t2id);
           System.out.println(n + "[" + t1id + " -> " + t2id + "]");
           toh(n - 1, t3id, t2id, t1id);
    }

}
/* 
input-
3
10
11
12
output-
1[10 -> 11]
2[10 -> 12]
1[11 -> 12]
3[10 -> 11]
1[12 -> 10]
2[12 -> 11]
1[10 -> 11]
*/