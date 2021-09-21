package arrangementTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int num = 0;
		List<String> list = new ArrayList<>();
		
		for ( int i = 0 ; i < 9 ; i ++) {
			 list.add(sc.nextLine());
		}
		
		for ( int n = 0 ; n < 9 ; n++) {
			if ( max < Integer.parseInt(list.get(n)) ) {
				max = Integer.parseInt(list.get(n));
				num = n+1;
			}
		}
		
		System.out.println(max);
		System.out.println(num);
		sc.close();
	}

}
