import java.util.*;

public class _2d_array_demo {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt(); 
      int[][] arr = new int[n][m];
        for (int i = 0;  i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
     
    }
}
/* 
input -
2
4
11
12
13
14
21
22
23
24
output-
11 12 13 14 
21 22 23 24 
*/