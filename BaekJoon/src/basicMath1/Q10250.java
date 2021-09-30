package basicMath1;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for ( int i = 0 ; i < T ; i++) {
			String s = sc.nextLine();
			String[] ss= s.split(" ");
			
			int H =Integer.parseInt(ss[0]);
			int W =Integer.parseInt(ss[1]);
			int N =Integer.parseInt(ss[2]);
			
			int a = (N/H);
			int aa = (N%H);
			int b = N - a*H;
			
			if ( aa == 0 ) {
				System.out.printf("%d%02d",H,a);
			} else {
				System.out.printf("%d%02d",b,a+1);
			}
			
		}
		sc.close();
	}

}
