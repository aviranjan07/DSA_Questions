import java.util.*;

public class display_array_in_reverse {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        displayArrReverse(arr, 0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx >= arr.length) {
            return;
        }
       displayArrReverse(arr, idx + 1);
       System.out.println(arr[idx]);
    }

}
/* 
input- 
1
2
3
4
5
output -
5
4
3
2
1
*/