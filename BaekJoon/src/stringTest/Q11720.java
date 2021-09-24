package stringTest;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		String[] ss = s.split("");
		int sum = 0;
		
		for ( int i = 0 ; i < N ; i++) {
			sum += Integer.parseInt(ss[i]);
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
