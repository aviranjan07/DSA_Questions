import java.io.*;
import java.util.*;

public class get_common_element_1{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i < arr1.length; i++) {
        arr1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0; i < arr2.length; i++) {
        arr2[i] = scn.nextInt();
    }

    // travel through arr1 and fill hashmap
    HashMap<Integer, Integer> fmap = new HashMap<>();
    for(int val: arr1) {
        if(fmap.containsKey(val) == false) {
            fmap.put(val, 1);
        } else {
            int of = fmap.get(val);
            int nf = of + 1;
            fmap.put(val, nf);
        }
    }

    // travel through second array, print and remove
    for(int val: arr2) {
        if(fmap.containsKey(val) == true) {
            System.out.println(val);
            fmap.remove(val);
        }
    }
 }

}
/* 
input-
9
5
5
9
8
5
5
8
0
3
18
9
7
1
0
3
6
5
9
1
1
8
0
2
4
2
9
1
5
output-
9
0
3
5
8
*/