package basicMath1;

import java.util.Scanner;

public class Q1011 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < T ; i ++) {
			
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			
			int x = Integer.parseInt(ss[0]);
			int y = Integer.parseInt(ss[1]);
			int d = y-x;
			int ans = 0;
			
			if ( d == 1) {
				System.out.println(1);
			} else if ( d == 2) {
				System.out.println(2);
			} else if ( d == 3 || d == 4) {
				System.out.println(3);
			} else if ( d == 5 || d == 6) {
				System.out.println(4);
			} else if ( d > 6 ) {
				
				for ( int j = 3 ; j < d ; j ++) {
					
					if ( d <= j*j && d > (j-1)*(j-1)) {
						ans = j+3;
						break;
					}
				}
				
				System.out.println(ans);
			}
		}
		
		sc.close();
		
	}
}
