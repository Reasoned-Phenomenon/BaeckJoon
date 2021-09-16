package ifTest;

import java.util.Scanner;

public class Q1330 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] s = input.split(" ");
		
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		if ( A > B) {
			System.out.println(">");
		} else if (A < B ) {
			System.out.println("<");
		} else System.out.println("==");
		
		sc.close();
		
	}

}
