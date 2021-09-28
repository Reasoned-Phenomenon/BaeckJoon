package basicMath1;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		
		//1+3(n)(n+1)
		for ( int i = 1 ; i < N ; i++) {
			
			if ( N == 1) {
				System.out.println(1);
			} else if ( (N >=(1+3*i*(i+1)))&&(N <= (1+3*(i+1)*(i+2)))) {
				cnt = i+1;
			}
		}
		
		System.out.println(cnt+1);
		
		sc.close();
		
	}

}
