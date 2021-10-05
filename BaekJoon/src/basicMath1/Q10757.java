package basicMath1;

import java.util.Scanner;

public class Q10757 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss = s.split(" ");
		
		String a = ss[0];
		String b = ss[1];
		
		String[] aa = null;
		String[] bb = null;
		int[] ab = null;
		
		if (a.length() > 18 || b.length() > 18) {
			
			for ( int i = 0 ; i < a.length();i++) {
				aa[i] = a.substring(a.length()-i, a.length()-i);
			}
			
			for ( int i = 0 ; i < b.length();i++) {
				bb[i] = a.substring(b.length()-i, b.length()-i);
			}
			
			for (int i = 0; i<a.length() || i<b.length() ; i ++) {
				if (aa[i] == null) {
					aa[i]="0";
				}
				if (bb[i] == null) {
					bb[i]="0";
				}
				ab[i] = Integer.parseInt(aa[i])+Integer.parseInt(bb[i]);
			}
			for (int i = 0 ; i< ab.length ; i ++) {
				if( ab[i] >= 10) {
					ab[i]--;
					ab[i+1]++;
				}
			}
			
			
			
		} else {
			System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		}
		
		sc.close();
	}

}
