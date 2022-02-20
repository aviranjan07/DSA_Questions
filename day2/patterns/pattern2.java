import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nstar = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nstar; j++){
                System.out.print("*\t");
            }
            nstar--;
        System.out.println();
        }
    }
}

/*
input & output
6
*       *       *       *       *       *       
*       *       *       *       *
*       *       *       *
*       *       *
*       *
*
*/
