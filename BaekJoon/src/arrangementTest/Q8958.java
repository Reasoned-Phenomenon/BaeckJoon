package arrangementTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		List<String> list = new ArrayList<>();
		
		for ( int i = 0 ; i < N ; i ++) {
			
			int score = 0 ;
			int sum = 0 ;
			
			String a = sc.nextLine();
			String[] b = null;
			list.clear();
			b = a.split("");
			
			for (int n = 0 ; n < b.length ; n++) {
				list.add(b[n]);
			}
			
			for (int r = 0 ; r < b.length ; r++) {
				
				if ( list.get(r).equals("X") ) {
					score = 0;
				} else if (list.get(r).equals("O") ) {
					score = score + 1;
					sum += score;
				}
				
			}
			
			System.out.println(sum);
			
		}
		
		sc.close();
		
	}

}

