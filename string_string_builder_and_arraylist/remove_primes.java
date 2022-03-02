import java.util.*;

public class remove_primes {
    public static boolean isPrime(int val) {
        for(int div = 2; div * div <= val; div++) {
            if(val % div == 0) {
                return false;
            }
        }
        return true;
    }
	public static void solution(ArrayList<Integer> a1){
		// write your code here
        for(int i = a1.size() - 1; i >= 0; i--) {
            int val = a1.get(i);
            if(isPrime(val) == true) {
                a1.remove(i);
            }
        }

		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
/* 
input-
4
3 12 13 15
output-
[12, 15]
*/
