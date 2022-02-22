import java.util.*;

public class String_With_Difference_Of_Every_Two_Consecutive_Characters {

	public static String solution(String str){
		// write your code here
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            int gap = curr - prev;

            sb.append(gap);
            sb.append(curr);
        }

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
/* 
input -
aviranjan
output-
a21v-13i9r-17a13n-4j-9a13n
*/