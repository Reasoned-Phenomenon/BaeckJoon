package basicMath1;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for ( int i = 0 ; i < T ; i++) {
			String s = sc.nextLine();
			String[] ss= s.split(" ");
			
			int H =Integer.parseInt(ss[0]);
			int N =Integer.parseInt(ss[2]);
			
			int a = (N/H); //몫 -> 호수 결정
			int aa = (N%H); //나머지 -> 층 결정
			
			if ( aa == 0 ) { // 나누어 떨어지는 경우, 제일 윗층을 사용하는데 0층을 사용하는 것으로 나오므로 따로 계산
				System.out.printf("%d%02d%n",H,a);
			} else {
				System.out.printf("%d%02d%n",aa,a+1);
			}
			
		}
		sc.close();
	}

}
