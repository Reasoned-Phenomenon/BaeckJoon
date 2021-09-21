package arrangementTest;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		
		int max = -1000000;
		int min = 1000000;
		
		for ( int i = 0 ; i < N ; i++) {
			if ( min > Integer.parseInt(ss[i]) ) {
				min = Integer.parseInt(ss[i]);
			}
		}
		
		for ( int i = 0 ; i < N ; i++) {
			if ( max < Integer.parseInt(ss[i]) ) {
				max = Integer.parseInt(ss[i]);
			}
		}
		
		System.out.println(min + " " + max);
		
		sc.close();
	}

}
