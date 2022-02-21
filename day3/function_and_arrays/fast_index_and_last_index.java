import java.util.*;

public class fast_index_and_last_index{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
    }

    int data = scn.nextInt();

    int lo = 0;
    int hi = arr.length - 1;
    int foundAt = -1;

    while(lo <= hi) {
        int mid = (lo + hi) / 2;
        if(data > arr[mid]) {
            lo = mid + 1;
        }else if (data < arr[mid]) {
            hi = mid - 1;
        } else {
            foundAt = mid;
            hi = mid - 1;
        }
     }
     System.out.println(foundAt);

      lo = 0;
      hi = arr.length - 1;
      foundAt = -1;
    while(lo <= hi) {
        int mid = (lo + hi) / 2;
        if(data > arr[mid]) {
            lo = mid + 1;
        }else if (data < arr[mid]) {
            hi = mid - 1;
        } else {
            foundAt = mid;
            lo = mid + 1;
        }
     }
    System.out.println(foundAt);
    }
 }
 
/*
input-
15
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33
output-
5
9
*/ 

