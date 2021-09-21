package whileTest;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = "시작";
		String[] ss = {"시작", "시작"};
		
		try {
			while ( ss != null ) {
				
				s = sc.nextLine();
				ss = s.split(" ");
				
				String A = ss[0];
				String B = ss[1];
				
				int C = Integer.parseInt(A) + Integer.parseInt(B);
				
				System.out.println(C);
						
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		sc.close();
	}
}
