import java.util.*;

public class bar_chart {
    public static void main (String[] args) throws Exception {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
    
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // find max of element
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
              if (arr[i] > max ) {
            max = arr[i];
          }
        }
         //   shape 
           for(int ht = max; ht >= 1; ht--) {
               for (int i = 0; i < arr.length; i++) {
                   if (arr[i] >=  ht) {
                       System.out.print("*\t");
                   }else {
                       System.out.print("\t");
                   }
    
               }
               System.out.println();
           }    
        }
     }
/*
input
5
3
1
0
7
5
output-
                        *
                        *
                        *       *       
                        *       *       
*                       *       *       
*                       *       *       
*       *               *       *

*/
    