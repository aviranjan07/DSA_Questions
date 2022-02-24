import java.io.*;
import java.util.*;

public class print_subsequence {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str, "");

    }

    public static void printSS(String ques, String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans + ch);
        printSS(roq, ans + "");
        
    }

}
/* 
input-
yvTA
output-
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A
*/