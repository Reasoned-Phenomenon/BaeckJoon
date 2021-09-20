package forTest;

import java.util.Scanner;

public class Q11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		
		for (int i = 1 ; i <= X ; i++) {
			
			String a = sc.nextLine();
			String[] b = a.split(" ");
			
			int A = Integer.parseInt(b[0]);
			int B = Integer.parseInt(b[1]);
			int C = A+B ;
			
			System.out.println("Case #"+i+": "+ C );
			
		}
		
		sc.close();
		
	}

}
