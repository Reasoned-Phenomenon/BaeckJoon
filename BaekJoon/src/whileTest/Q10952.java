package whileTest;

import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = 10;
		int B = 10;
		
		while( A != 0 || B != 0) {
			
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			A = Integer.parseInt(ss[0]);
			B = Integer.parseInt(ss[1]);
			
			if ( A != 0 && B !=0  ) {
				System.out.println(A+B);
			}
			
		}
		
		sc.close();
		
	}

}
