package whileTest;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String X = sc.nextLine();
		int Y = Integer.parseInt(X);
		int Z = Y;
		int cnt = 0;
		
		do {
			
			int a = Y/10 ; 
			int b = Y - (10 * a); 
			Y = 10*b + ((a+b) - 10 * ((a+b)/10));
			cnt++;
			
		} while ( Z != Y); 
		
		System.out.println(cnt);
		
		sc.close();
	
	}

}
