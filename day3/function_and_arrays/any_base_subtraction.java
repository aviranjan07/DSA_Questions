import java.util.*;
  
  public class any_base_subtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int res = 0;
       int tp = 1;
       int c = 0;
       while (n2 > 0) {
           int d1 = n1 % 10;
           n1 = n1 / 10;
           int d2 = n2 % 10;
           n2 = n2 / 10;

           int d = d2 - c - d1;
           if(d < 0) {
               c = 1;
               d = d + b;
           }else {
               c = 0;
        }
        res = res + d * tp;
        tp = tp * 10;
       }
       return res;
   }
  
  }
  /*
input-
8
1
100
output-
77
*/
