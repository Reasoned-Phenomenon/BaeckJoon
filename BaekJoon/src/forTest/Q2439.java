package forTest;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		
		for ( int n = 1 ; n <= X ; n++ ) {
			
			System.out.printf("%"+X+"s","*");
			
			for ( int i = 1 ; i < n ; i++ ) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		sc.close();
	}

}
