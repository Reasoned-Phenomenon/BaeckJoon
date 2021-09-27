package stringTest;

import java.util.Scanner;

public class Q2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String q = sc.nextLine();
		
		String[] AB = q.split(" ");
		
		String A = AB[0];
		String B = AB[1];
		
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);
		
		int aa = a/100;
		int ab = (a/10)-(10*aa); 
		int ac = a - (100*aa) - (10 * ab);
		
		int ba = b/100;
		int bb = (b/10)-(10*ba); 
		int bc = b - (100*ba) - (10 * bb);
		
		int newA = 100 * ac + 10 * ab + aa;
		int newB = 100 * bc + 10 * bb + ba;
		
		if (newA > newB) {
			System.out.println(newA);
		} else if ( newA < newB ) {
			System.out.println(newB);
		}
		
		sc.close();
		
	}

}
