package getting_started;
import java.util.*;

public class pythagorean_triplet {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if(b >= max ) {
             max = b;
        }
        if (c >= max){
            max = c;
        }
        if (max == a){
            if((a * a) == (b * b) + (c * c)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }else if (max == b){
            if((b * b) == (a * a) + (c * c)) {
                System.out.println(true);
            } else {
                System.out.println(false);
        }
      }else {
        if((c * c) == (a * a) + (b * b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
      }
    }
 }
}