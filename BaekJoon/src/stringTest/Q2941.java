package stringTest;

import java.util.Scanner;

public class Q2941 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String ca = sc.nextLine();
		
		String A = null;
		String B = null;
		String C = null;
		String D = null;
		String E = null;
		String F = null;
		String G = null;
		String H = null;
		
		if (ca.contains("dz=")) {
			A = ca.replace("dz=", "@");
			B = A.replace("c=", "*");
			C = B.replace("c-", "*");
			D = C.replace("d-", "*");
			E = D.replace("lj", "*");
			F = E.replace("nj", "*");
			G = F.replace("s=", "*");
			H = G.replace("z=", "*");
		} else {
			B = ca.replace("c=", "*");
			C = B.replace("c-", "*");
			D = C.replace("d-", "*");
			E = D.replace("lj", "*");
			F = E.replace("nj", "*");
			G = F.replace("s=", "*");
			H = G.replace("z=", "*");
		}
			
		String[] an = H.split("");
		
		int num = an.length;
		
		System.out.println(num);
			
		sc.close();
		
	}

}
