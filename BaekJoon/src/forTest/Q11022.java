package forTest;

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for ( int i = 1 ; i <= T ; i++) {
			
			String before = sc.nextLine();
			String[] after = before.split(" ");
			
			int A = Integer.parseInt(after[0]);
			int B = Integer.parseInt(after[1]);
			
			int C = A+B;
			
			System.out.println("Case #" + i + ": " + A + " + "+ B + " = "+ C);
		}
		
		
		sc.close();
	}

}
