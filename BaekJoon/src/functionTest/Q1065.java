package functionTest;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		
		for ( int i = 1 ; i <= N ; i++) {
			
			if ( i < 100 ) {
				
				cnt++;
				
			} else if ( i >=100 && i < 1000) {
				
				String s = Integer.toString(i);
				String[] ss = s.split("");	
				
				int a = Integer.parseInt(ss[0]);
				int b = Integer.parseInt(ss[1]);
				int c = Integer.parseInt(ss[2]);
				
				int A = (b-a);
				int B = (c-b);
				
				if ( A == B ) {
					cnt++;
				}
				
			}
			
		}
		
		System.out.println(cnt);
		
		sc.close();
		
	}

}
