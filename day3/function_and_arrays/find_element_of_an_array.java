import java.util.*;

public class find_element_of_an_array {
    public static void main (String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            System.out.println(i);
        }
        int num = scn.nextInt();
        int foundAt = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                foundAt = i;
                break;
            }
        }
        System.out.println(foundAt);
    }
}
/* 
input-
6
15
30
40
4
11
9
0
1
2
3
4
5
40
output-
2
*/