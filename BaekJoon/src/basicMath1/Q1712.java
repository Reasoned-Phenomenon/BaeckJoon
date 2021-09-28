package basicMath1;

import java.util.Scanner;

public class Q1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		int A = Integer.parseInt(ss[0]); //고정비용
		int B = Integer.parseInt(ss[1]); //가변비용
		int C = Integer.parseInt(ss[2]); //가격
		
		if ( C <= B ) {
			System.out.println("-1");
		} else {
			int cal = A / (C-B);
			System.out.println(cal+1);
		} 
		
		sc.close();
		
	}

}
