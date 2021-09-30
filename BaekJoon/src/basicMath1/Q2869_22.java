package basicMath1;

import java.util.Scanner;

public class Q2869_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String ABV = sc.nextLine();
		String[] abv = ABV.split(" ");
		int A = Integer.parseInt(abv[0]);
		int B = Integer.parseInt(abv[1]);
		int V = Integer.parseInt(abv[2]);
		
		int m = A-B;
		int mm = V-A;
		int cnt = mm/m;
		
		if (A > mm - (m*(cnt)) ) {
			System.out.println(cnt+1);
		} else {
			System.out.println(cnt+2);
		}
		
		sc.close();
	}

}
