package arrangementTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = Integer.parseInt(sc.nextLine());
		int B = Integer.parseInt(sc.nextLine());
		int C = Integer.parseInt(sc.nextLine());
		int D = Integer.parseInt(sc.nextLine());
		int E = Integer.parseInt(sc.nextLine());
		int F = Integer.parseInt(sc.nextLine());
		int G = Integer.parseInt(sc.nextLine());
		int H = Integer.parseInt(sc.nextLine());
		int I = Integer.parseInt(sc.nextLine());
		int J = Integer.parseInt(sc.nextLine());
		
		int a = A%42;
		int b = B%42;
		int c = C%42;
		int d = D%42;
		int e = E%42;
		int f = F%42;
		int g = G%42;
		int h = H%42;
		int i = I%42;
		int j = J%42;
		
		Set<Integer> set = new HashSet<>();
		
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);
		set.add(e);
		set.add(f);
		set.add(g);
		set.add(h);
		set.add(i);
		set.add(j);
		
		System.out.println(set.size());
		
		sc.close();
		
	}

}
