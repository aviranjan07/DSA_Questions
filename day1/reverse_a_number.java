import java.util.*;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

    while (n != 0){
        int quo = n / 10;
        int rem = n % 10;
        System.out.println(rem);
        n = quo;
      }
    }
}

// input-
//  7865443 

