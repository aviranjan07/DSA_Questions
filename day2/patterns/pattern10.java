import java.util.*;

public class pattern10 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    
        int nis = -1;
        int nos = n / 2;
        for ( int i = 1; i <= n; i++) {
            // outer space
            for(int j = 1; j <= nos; j++){
                System.out.print("\t");
            }
    
            System.out.print("*\t");
            //  inner space 
            for(int j = 1; j <= nis; j++){
                System.out.print("\t");
            }
             if(i > 1 && i < n) {
                 System.out.print("*\t");
             }
            if(i <= n/2 ) {
                nos--;
                nis += 2;
            } else {
                nos++;
                nis -= 2;
            }
            System.out.println();
        }
    }
}

/*
input & output
5
                *       
        *               *       
*                               *       
        *               *
                *
*/                