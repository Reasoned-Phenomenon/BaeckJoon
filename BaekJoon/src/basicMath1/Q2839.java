package basicMath1;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		int f = 0;
		int t = 0;

		if ( N % 15 == 0 ) {
			f = N/5;
			t = (N%5)/3;
			System.out.println(f+t);
		} else if ( N % 5 == 0 ) {
			f = N/5;
			System.out.println(f+t);
		} else if ( N % 3 == 0) {
			t = N/3;
			System.out.println(f+t);
		} else {
			System.out.println(-1);
		}
		
		sc.close();
	}

}
