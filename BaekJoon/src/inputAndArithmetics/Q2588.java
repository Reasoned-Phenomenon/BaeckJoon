package inputAndArithmetics;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = b/100; //100�� �ڸ�
		int d = ((b-100*c)/10); //10�� �ڸ�
		int e = b-(100*c)-(10*d); //1���ڸ�
		
		System.out.println(a*e);
		System.out.println(a*d);
		System.out.println(a*c);
		System.out.println(a*b);

		sc.close();
	}

}
