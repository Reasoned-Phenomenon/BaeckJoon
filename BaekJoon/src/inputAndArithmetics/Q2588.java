package inputAndArithmetics;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = b/100; //100의 자리
		int d = ((b-100*c)/10); //10의 자리
		int e = b-(100*c)-(10*d); //1의자리
		
		System.out.println(a*e);
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*b);

		sc.close();
	}

}
