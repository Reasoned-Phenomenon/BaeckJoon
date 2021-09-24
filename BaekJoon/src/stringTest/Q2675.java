package stringTest;

import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for ( int i = 1 ; i <= T ; i++) {
			
			String s = sc.nextLine();
			String[] ss = s.split("");
			
			for ( int n = 1 ; n <= ss.length-2 ; n++) {
				
				for ( int x = 1 ; x <= Integer.parseInt(ss[0]) ; x++) {
					
					System.out.print(ss[n+1]);
					
				}
				
			}
			
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
