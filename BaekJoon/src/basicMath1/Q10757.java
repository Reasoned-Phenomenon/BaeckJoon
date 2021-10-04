package basicMath1;

import java.util.Scanner;

public class Q10757 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		try {
			long A = Long.parseLong(ss[0]);
			System.out.println(A);
			long B = (long) Long.parseLong(ss[1]);
			System.out.println(B);
			
			long AB = A+B;
			
			System.out.println(AB);
			
		} catch(Exception e) {
			e.getStackTrace();
		}
		
		
		sc.close();
	}

}
