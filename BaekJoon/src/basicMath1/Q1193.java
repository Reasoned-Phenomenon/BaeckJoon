package basicMath1;

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		int a = 0;
		int b = 0;
		int g = 1; //g��° �׷�
		
		//�׷�Ȯ��
		if ( X == 1) {
			System.out.println("1/1");
		} else if (X != 1) {
			
			while ( true ) {
				if ( (X > ((g-1) * g)/2 ) && (X <= (g*(g+1))/2 ) ) {
					break;
				}
				g++;
			}
			
			//�׷쳻���� ���°���� �˾ƾ���
			int num = X - ((g-1)*g)/2 ;
			
			//a,b����
			//g�� ¦���� 1�ν���
			//g�� Ȧ���� g�� ����
			if ( g%2 == 0 ) { //¦����
				a = num;
				b = g-num+1;
			} else if ( g%2 == 1 ) { //Ȧ����
				a= g-num+1;
				b= num;		
			}
			
			System.out.println(a+"/"+b);
		}
		
		sc.close();
	}

}
