package stringTest;

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		
		int num1 = ss.length;
		int num2 = num1 - 1;
		
		if ( ss.length==0) {
			System.out.println("0");
		} else if (ss[0].equals("")) {
			System.out.println(num2);
		} else {
			System.out.println(num1);
		}
		sc.close();
		
	}

}
