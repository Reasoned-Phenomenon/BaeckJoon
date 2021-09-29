package basicMath1;

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = Integer.parseInt(sc.nextLine());
		int a = 0;
		int b = 0;
		int g = 1; //g번째 그룹
		
		//그룹확인
		if ( X == 1) {
			System.out.println("1/1");
		} else if (X != 1) {
			
			while ( true ) {
				if ( (X > ((g-1) * g)/2 ) && (X <= (g*(g+1))/2 ) ) {
					break;
				}
				g++;
			}
			
			//그룹내에서 몇번째인지 알아야함
			int num = X - ((g-1)*g)/2 ;
			
			//a,b산출
			//g가 짝수면 1로시작
			//g가 홀수면 g로 시작
			if ( g%2 == 0 ) { //짝수면
				a = num;
				b = g-num+1;
			} else if ( g%2 == 1 ) { //홀수면
				a= g-num+1;
				b= num;		
			}
			
			System.out.println(a+"/"+b);
		}
		
		sc.close();
	}

}
