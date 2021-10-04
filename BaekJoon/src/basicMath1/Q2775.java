package basicMath1;

import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Test case
		int T = Integer.parseInt(sc.nextLine());
		
		for( int i = 0; i < T ; i ++) {
			//kÃþ nÈ£
			int k = Integer.parseInt(sc.nextLine());
			int n = Integer.parseInt(sc.nextLine());
			int answer = 0 ;
			
			if ( n == 0) {
				answer = 1;
				break;
			}
			if ( k == 0) {
				answer = n;
				break;
			}
			
			int[][] arr = new int[k+1][n];
			
			for ( int p = 0 ; p <= k ; p++) {
				arr[p][0] = 1;
			}
			for ( int j = 1 ; j <= n-1 ; j++) {
				arr[0][j] = j+1;
			}
			
			for (int o = 1 ; o <= k ; o++) {
				for(int r = 1 ; r <= n-1;r++ ) {
					arr[o][r] = arr[o][r-1] + arr[o-1][r];
				}
			}
			
			answer = arr[k][n-1];
			System.out.println(answer);
			
		}
		
		sc.close();
	}

}
