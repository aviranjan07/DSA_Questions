import java.util.*;

public class display_array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);
    }

    public static void displayArr(int[] arr, int idx){
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
        
    }

}

/* 
input- 
5
12
13
14
15
15
output-
12
13
14
15
15
*/
