package stringTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		String s = null;
		String[] ss = null;
		
		int match = 0;
		
		for ( int i = 0 ; i < N ; i ++ ) {
			
			Set<String> set = new HashSet<>();
			int cnt = 0 ;
			
			s = sc.nextLine();
			ss = s.split("");
			
			for (int n = 0 ; n < ss.length ; n++) {
				set.add(ss[n]);
			}
			
			for (int n = 1 ; n < ss.length ; n++) {
				
				if ( ! ss[n-1].equals(ss[n])) {
					cnt++;
				}
				
			}
			
			int size = set.size();
			
			if ( cnt == size-1) {
				match++;
			}
			
		}
		
		System.out.println(match);
		
		sc.close();
	}

}
