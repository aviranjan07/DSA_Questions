import java.util.*;

public class spiral_display {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int count = 1;
        int total = r * c;

        while (count <= total) {
            // left wall, downwards 
            for (int i = minr, j = minc; i <= maxr && count <= total; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            // bottom wall, rightwards 
            for (int i = maxr, j = minc; j <= maxc && count <= total; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--; 
            // right wall , upwards
            for (int i = maxr, j = maxc; i >= minr && count <= total; i--) {
                System.out.println(arr[i][j]);
                count++;
            } 
            maxc--;
            // top wall , leftwards
            for (int i = minr, j = maxc; j >= minc && count <= total; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }

}
/* 
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
output-
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/