import java.util.*;

public class the_state_of_wakanda_2 {
    public static void main (String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for ( int g = 0; g < arr.length; g++) {
            for ( int i = 0, j = g; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

/* 
input- 
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
output-
11
22
33
44
12
23
34
13
24
14
*/