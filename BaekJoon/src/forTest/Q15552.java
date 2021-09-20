package forTest;

import java.util.Scanner;

public class Q15552 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = null;
		String[] ab = null;
		
		int X = Integer.parseInt(sc.nextLine());
		
		for ( int i = 0 ; i < X ; i++) {
			
			s = sc.nextLine();
			ab = s.split(" ");
			
			int A = Integer.parseInt(ab[0]);
			int B = Integer.parseInt(ab[1]);
			
			System.out.println(A+B);
		}
		
		sc.close();
		
	}

}
