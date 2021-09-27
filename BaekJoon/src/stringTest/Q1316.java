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
		int cnt = 0 ;
		int match = 0;
		Set<String> set = new HashSet<>();
		
		for ( int i = 0 ; i < N ; i ++ ) {
			
			s = sc.nextLine();
			ss = s.split("");
			
			for (int n = 0 ; n < ss.length ; n++) {
				set.add(ss[n]);
			}
			
			for (int n = 1 ; n <= ss.length ; n++) {
				
				if ( ! ss[n-1].equals(ss[n])) {
					cnt++;
				}
				
			}
			
			int size = set.size();
			System.out.println("===num " + size);
			System.out.println("===cnt " + cnt);
			if ( cnt == size) {
				match++;
			}
			
		}
		
		System.out.println(match);
		
		sc.close();
	}

}
