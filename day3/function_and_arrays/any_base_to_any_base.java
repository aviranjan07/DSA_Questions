import java.util.*;
  
  public class any_base_to_any_base{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans = convertFromB1ToB2(n, sourceBase, destBase);
     System.out.println(ans);
   }
   public static int convertFromB1ToB2(int n, int b1, int b2 ){
    //    b1 se decimel 
    int dec = getValueInDecimel(n , b1);
    //   decimel to b2 
    int ans = getValueInBase(dec, b2);
    return ans;

   }   


   public static int getValueInBase(int n, int b) {

    int dn = 0;
    int tp = 1;
    while (n > 0) {
        int rem = n % b;
        n = n / b;

        dn = dn + rem * tp;
        tp = tp * 10;
    }

   return dn;
}
public static int getValueInDecimel (int n, int b) {
       
    int dn = 0;
    int bp = 1;
    while (n > 0) {
        int rem = n % 10;
        n = n / 10;

        dn = dn + rem * bp;
        bp = bp * b;
    }
return dn;
  }
}
/*
input-
111001
2
3
output
2010
*/