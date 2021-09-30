package basicMath1;

import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String ABV = sc.nextLine();
		long t1 = System.nanoTime();
		String[] abv = ABV.split(" ");
		
		int A = Integer.parseInt(abv[0]);
		int B = Integer.parseInt(abv[1]);
		int V = Integer.parseInt(abv[2]);
		
		int cnt = 1;
		
		while ( A < V ) {
			
			V = V-A;
			cnt++;
			
			if ( V > 0 ) {
				V = V + B;
			} else {
				break;
			}
			
		}
		
		System.out.println(cnt);
		
		sc.close();
		long t2 = System.nanoTime();
		System.out.println(t2-t1);
	}

}
