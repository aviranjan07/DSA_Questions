import java.util.*;

public class subarray_problem{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
    }
    for (int si = 0; si < arr.length; si++) {
        for (int ei = si; ei < arr.length; ei++) {
            for (int i = si; i <= ei; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
 }

}
/* 
input-
3
10
20
30
output-
10      
10      20
10      20      30
20
20      30
30
*/