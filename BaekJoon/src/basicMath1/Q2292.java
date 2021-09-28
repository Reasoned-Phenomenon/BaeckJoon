package basicMath1;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		
		//1+3(n)(n+1)
		//i < x 에서 x 값 구하기
		for ( int i = 0 ; i < N ; i++) {
			
			if ( N == 1) {
				System.out.println(1);
				break;
			} else if ( (N >=(1+3*i*(i+1))+1)&&(N <= (1+3*(i+1)*(i+2)))) {
				cnt = i+2;
				System.out.println("==="+cnt);
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
		
	}

}
