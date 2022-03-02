import java.util.*;

public class the_state_of_wakanda_1 {
    public static void main (String[] args) throws Exception {
        // write your code 
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    
        for(int j = 0; j < arr[0].length; j++) {
            if ( j % 2 == 0) {
                for(int i = 0; i < arr.length; i++){
                   System.out.println(arr[i][j]);
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i][j]);
             } 
          }
            
        }
    
     }
    
    }
/* 
input- 
3
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
output-
11
21
31
32
22
12
13
23
33
34
24
14
*/
