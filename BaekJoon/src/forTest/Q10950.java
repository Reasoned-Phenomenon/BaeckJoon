package forTest;

import java.util.Scanner;

public class Q10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		String N = null;
		String[] s = null;
		
		for ( int i = 0 ; i < T ; i++) {
			N = sc.nextLine();
			s = N.split(" ");
			
			int A = Integer.parseInt(s[0]); 
			int B = Integer.parseInt(s[1]); 
			
			System.out.println(A+B);
			
		}	
		
		sc.close();
		
	}

}
