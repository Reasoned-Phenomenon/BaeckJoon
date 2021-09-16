package forTest;

import java.util.Scanner;

public class Q10950 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for ( int i = 0 ; i <= T ; i++) {
			String N = sc.nextLine();
			String[] s = N.split(" ");
			int A = Integer.parseInt(s[i]);
			int B = Integer.parseInt(s[i+1]);
			
			System.out.println(A+B);
		}
		
		
		
		
		sc.close();
		
	}

}
