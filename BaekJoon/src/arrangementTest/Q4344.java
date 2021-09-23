package arrangementTest;

import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int C = Integer.parseInt(sc.nextLine());
		
		for ( int n = 0 ; n < C ; n++ ) {
			
			String a = sc.nextLine();
			String[] b = a.split(" ");
			int N = Integer.parseInt(b[0]); 
			
			int sum = 0 ;
			int avg = 0 ;
			int cnt = 0 ;
			
			for( int i = 1 ; i <= N ; i++ ) {
				sum += Integer.parseInt(b[i]);
			}
			
			avg = sum/N;
			
			for ( int r = 1 ; r <= N ; r++) {
				if (Integer.parseInt(b[r]) > avg ) {
					cnt++;
				}
			}
			
			double rate = ((double) cnt / N ) * 100 ;
			
			System.out.printf("%.3f%s\n",rate,"%");
			
		}
		
		sc.close();
		
	}

}
