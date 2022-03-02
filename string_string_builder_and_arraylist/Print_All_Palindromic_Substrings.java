import java.util.*;

public class Print_All_Palindromic_Substrings {
	public static void main(String[] args) {
            //write your code here
            Scanner scn = new Scanner(System.in);
            String s = scn.nextLine();
    
            for( int i = 0; i < s.length(); i++) {
                for(int j = i; j <= s.length(); j++){
                String sub = s.substring(i, j);

                boolean isPalindrome = IsPalindrome(sub);
                if(isPalindrome == true) {
                    System.out.println(sub);
                }
                
            }
            
        }
    }

 public static  boolean IsPalindrome(String sub) {
     boolean flag = true;

     int left = 0;
     int right = sub.length() - 1;
     while(left < right) {
         char chleft = sub.charAt(left);
         char chright = sub.charAt(right);
         if(chleft != chright) {
             flag = false;
             break;
         }
         left++;
         right--;
     }
     return flag;
  }   
}

/* 
input
abcc
output-
a

b

c
cc

c
*/
