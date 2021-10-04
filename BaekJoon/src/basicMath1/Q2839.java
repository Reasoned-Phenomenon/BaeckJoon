package basicMath1;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		int f = 0;
		int t = 0;

		if ( N == 1 || N == 2 || N == 4 || N == 7) {
			
			System.out.println(-1);
			
		} else {
			switch(N%5) {
			
				case 0: {
					f = N/5;
				} break;
				
				case 1: {
					f = (N/5) - 1;
					t = (N-f*5)/3;
				} break;
				
				case 2: {
					f = (N/5) - 2;
					t = (N-f*5)/3;
				} break;
				
				case 3: {
					f = (N/5);
					t = (N-(f*5))/3;
				} break;
				
				case 4:{
					f = (N/5) - 1;
					t = (N-f*5)/3;
				}
			}
			System.out.println(f+t);
		}
		sc.close();
	}
}
