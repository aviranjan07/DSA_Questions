import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = 0;
        int nst = 1;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= nsp; j++){
                System.out.print("\t");
            }
             for(int j = 1; j <= nst; j++){
                System.out.print("*\t");
            }
            nsp++;
            System.out.println();
        }
    }
}

/*
input & output
5
*       
        *       
                *       
                        *       
                                *  
*/                                