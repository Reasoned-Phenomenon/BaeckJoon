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
			
			int a = (N/H); //�� -> ȣ�� ����
			int aa = (N%H); //������ -> �� ����
			
			if ( aa == 0 ) { // ������ �������� ���, ���� ������ ����ϴµ� 0���� ����ϴ� ������ �����Ƿ� ���� ���
				System.out.printf("%d%02d%n",H,a);
			} else {
				System.out.printf("%d%02d%n",aa,a+1);
			}
			
		}
		sc.close();
	}

}
