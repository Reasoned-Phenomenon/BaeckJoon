package arrangementTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		String P = sc.nextLine();
		String[] p = P.split(" ");
		
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		List<Integer> list = new ArrayList<>();
		
		for ( int i = 0 ; i < N ; i++) {
			list.add(Integer.parseInt(p[i]));
		}
		
		for ( int i = 0 ; i < N ; i++) {
			if ( max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		for (int i = 0 ; i < N ; i++) {
			sum += list.get(i);
		}
		
		avg = (((double)sum / N) * (100/(double)max));
		
		System.out.println(avg);
		
		sc.close();
		
	}

}
