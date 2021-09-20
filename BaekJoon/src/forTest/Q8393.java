package forTest;

import java.util.Scanner;

public class Q8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int A = Integer.parseInt(sc.nextLine());
		
		for ( int i = 1 ; i <= A ; i++) {
			
			sum += i;
			
		}	
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
