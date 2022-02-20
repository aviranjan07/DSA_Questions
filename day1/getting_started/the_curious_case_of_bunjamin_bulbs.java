package getting_started;
import java.util.*;

public class the_curious_case_of_bunjamin_bulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i * i <= n; i++){
            System.out.println(i * i);
        }
    }
}
