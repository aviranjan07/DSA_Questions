import java.util.*;

public class ring_rotate {
    public static void main (String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] twod = new int[n][m];

        for(int i = 0; i < twod.length; i++){
            for(int j = 0; j < twod[0].length; j++){
                twod[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        int[] oned = getOnedFromShell(twod, s);
        rotate(oned, r);
        fillTwodShellFromOned(oned, twod, s);
        display(twod);
    }

    public static int[] getOnedFromShell(int[][] twod, int s){
        int rows = twod.length;
        int cols = twod[0].length;

        int mir = s - 1;
        int mic = s - 1;
        int mar = rows - s;
        int mac = cols - s;

        int vwcount = mar - mir + 1;
        int hwcount = mac - mic + 1;
        int sz = 2 * vwcount + 2 * hwcount - 4;

        int[] oned = new int[sz];
        int idx = 0;

        for(int i = mir, j = mic; i <= mar; i++){
            oned[idx] = twod[i][j];
            idx++;
        }
        mic++;

        for(int i = mar, j = mic; j <= mac; j++){
            oned[idx] = twod[i][j];
            idx++;
        }
        mar--;

        for(int i = mar, j = mac; i >= mir; i--){
            oned[idx] = twod[i][j];
            idx++;
        }
        mac--;

        for(int i = mir, j = mac; j >= mic; j--){
            oned[idx] = twod[i][j];
            idx++;
        }
        mir++;

        return oned;
    }

    public static void fillTwodShellFromOned(int[] oned, int[][] twod, int s){
        int rows = twod.length;
        int cols = twod[0].length;

        int mir = s - 1;
        int mic = s - 1;
        int mar = rows - s;
        int mac = cols - s;

        int idx = 0;

        for(int i = mir, j = mic; i <= mar; i++){
            twod[i][j] = oned[idx];
            idx++;
        }
        mic++;

        for(int i = mar, j = mic; j <= mac; j++){
            twod[i][j] = oned[idx];
            idx++;
        }
        mar--;

        for(int i = mar, j = mac; i >= mir; i--){
            twod[i][j] = oned[idx];
            idx++;
        }
        mac--;

        for(int i = mir, j = mac; j >= mic; j--){
            twod[i][j] = oned[idx];
            idx++;
        }
        mir++;
    }

    public static void rotate(int[] oned, int r){
        r = r % oned.length;
        if(r < 0){
            r += oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1); // second half
        reverse(oned, 0, oned.length - 1); // full
    }

    public static void reverse(int[] oned, int left, int right){
        while(left < right){
            int temp = oned[left];
            oned[left] = oned[right];
            oned[right] = temp;

            left++;
            right--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
/*
input-
5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3
output -
11 12 13 14 15 16 17 
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
*/