package forTest;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		
		int N = Integer.parseInt(ss[0]);
		int X = Integer.parseInt(ss[1]);
		
		String A = sc.nextLine();
		String[] AA = A.split(" ");
		
		for ( int i = 0 ; i < N ; i ++) {
			if ( Integer.parseInt(AA[i]) < X ) {
				System.out.print(AA[i]+ " ");
			}
		}
		
		sc.close();
		
	}

}
