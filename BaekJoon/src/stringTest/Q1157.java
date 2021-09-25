package stringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//문자열 입력받아서
		String st = sc.nextLine();
		//문자 하나씩 배열에 넣고
		String[] ss= st.split("");
		//리스트 만들어서
		List<String> list = new ArrayList<>();
		//배열에 있는 문자들 리스트에 넣음
		for ( int i = 0 ; i < ss.length ; i++) {
			
			list.add(ss[i]);
			
		}
		
		//if로 하나씩 넣어도 되긴하겠지만, 다른 방법은 없을까
		
		//
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int n = 0;
		int o = 0;
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int t = 0;
		int u = 0;
		int v = 0;
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;		
		
		//각 문자의 갯수 세기
		for (int num = 0 ; num < ss.length ; num++) {
			
			if ( ss[num].contains("A") || ss[num].contains("a") ) {
				a++;
			} else if ( ss[num].contains("B") || ss[num].contains("b") ) {
				b++;
			}
				
		}
		
		//제일 많이 쓰인 문자 알아내기
		
		//제일 많이 쓰인 문자 또는 물음표 출력하기
		
		
		
		
		
		sc.close();
		
		
	}

}
