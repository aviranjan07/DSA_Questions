import java.util.*;

public class exit_point_of_an_matrix {
    public static void main (String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
         int r = scn.nextInt();
         int c = scn.nextInt();
         int[][] arr = new int[r][c];
         for (int i = 0; i < arr.length; i++) {
             for ( int j = 0; j < arr[0].length; j++) {
                 arr[i][j] = scn.nextInt();
             }
         }
         int i = 0; 
         int j = 0;
         int dir = 0;
         while (true) {
             dir = (dir + arr[i][j] ) % 4;
             if(dir == 0) { // east
                 j++;
                 if(j == arr[0].length) {
                     j--;
                     break;
                 }
             }else if(dir == 1) { // south
                i++;
                if(i == arr.length) {
                    i--;
                    break;
                }
             }else if (dir == 2) { //west
                 j--;
                 if (j == -1) {
                     j++;
                     break;
                 }
             }else { // north
                 i--;
                 if(i == -1) {
                     i++;
                     break;
                 }
             }
         }
         System.out.println(i);
         System.out.println(j);
    }
}
/* 
input -
4
4
0
0
1
0
1
0
0
0
0
0
0
0
1
0
1
0
output-
1
3
*/