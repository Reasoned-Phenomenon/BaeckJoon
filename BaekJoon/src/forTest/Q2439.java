package forTest;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		
		for ( int n = 1 ; n <= X ; n++ ) {
			
			for ( int i = X-n ; i > 0 ; i-- ) {
				
				System.out.print(" ");
				
			}
			
			for ( int i = 0 ; i < n ; i++ ) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		sc.close();
	}

}
