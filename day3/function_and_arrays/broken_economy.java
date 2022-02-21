import java.util.*;

public class broken_economy{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
    }
    int data = scn.nextInt();

    int left = 0;
    int right = arr.length - 1;
    int floor = -1;
    int ceil  = -1;

    while(left <= right) {
        int mid = (left + right) / 2;

        if (data > arr[mid]) {
            left = mid + 1;
            floor = arr[mid];
        } else if (data < arr[mid]) {
            right = mid - 1;
            ceil = arr[mid];
        }else {
            ceil = arr[mid];
            floor = arr[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}

/* 
input-
5
10
15
22
33
40
42
55
66
34
output-
40
33
*/