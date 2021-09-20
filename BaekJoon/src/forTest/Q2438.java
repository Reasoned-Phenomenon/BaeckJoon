package forTest;

import java.util.Scanner;

public class Q2438 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		
		for ( int n = 1 ; n <= X ; n++ ) {
			
			for ( int i = 0 ; i < n ; i++ ) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
