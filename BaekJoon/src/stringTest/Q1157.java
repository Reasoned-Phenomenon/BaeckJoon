package stringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//���ڿ� �Է¹޾Ƽ�
		String st = sc.nextLine();
		//���� �ϳ��� �迭�� �ְ�
		String[] ss= st.split("");
		//����Ʈ ����
		List<String> list = new ArrayList<>();
		//�迭�� �ִ� ���ڵ� ����Ʈ�� ����
		for ( int i = 0 ; i < ss.length ; i++) {
			list.add(ss[i]);
		}
		//if�� �ϳ��� �־ �Ǳ��ϰ�����, �ٸ� ����� ������
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
		
		//�� ������ ���� ����
		for (int num = 0 ; num < ss.length ; num++) {
			
			if ( ss[num].contains("A") || ss[num].contains("a") ) {
				a++;
			} else if ( ss[num].contains("B") || ss[num].contains("b") ) {
				b++;
			} else if ( ss[num].contains("C") || ss[num].contains("c") ) {
				c++;
			} else if ( ss[num].contains("D") || ss[num].contains("d") ) {
				d++;
			} else if ( ss[num].contains("E") || ss[num].contains("e") ) {
				e++;
			} else if ( ss[num].contains("F") || ss[num].contains("f") ) {
				f++;
			} else if ( ss[num].contains("G") || ss[num].contains("g") ) {
				g++;
			} else if ( ss[num].contains("H") || ss[num].contains("h") ) {
				h++;
			} else if ( ss[num].contains("I") || ss[num].contains("i") ) {
				i++;
			} else if ( ss[num].contains("J") || ss[num].contains("j") ) {
				j++;
			} else if ( ss[num].contains("K") || ss[num].contains("k") ) {
				k++;
			} else if ( ss[num].contains("L") || ss[num].contains("l") ) {
				l++;
			} else if ( ss[num].contains("M") || ss[num].contains("m") ) {
				m++;
			} else if ( ss[num].contains("N") || ss[num].contains("n") ) {
				n++;
			} else if ( ss[num].contains("O") || ss[num].contains("o") ) {
				o++;
			} else if ( ss[num].contains("p") || ss[num].contains("P") ) {
				p++;
			} else if ( ss[num].contains("Q") || ss[num].contains("q") ) {
				q++;
			} else if ( ss[num].contains("R") || ss[num].contains("r") ) {
				r++;
			} else if ( ss[num].contains("S") || ss[num].contains("s") ) {
				s++;
			} else if ( ss[num].contains("T") || ss[num].contains("t") ) {
				t++;
			} else if ( ss[num].contains("U") || ss[num].contains("u") ) {
				u++;
			} else if ( ss[num].contains("V") || ss[num].contains("v") ) {
				v++;
			} else if ( ss[num].contains("W") || ss[num].contains("w") ) {
				w++;
			} else if ( ss[num].contains("X") || ss[num].contains("x") ) {
				x++;
			} else if ( ss[num].contains("Y") || ss[num].contains("y") ) {
				y++;
			} else if ( ss[num].contains("Z") || ss[num].contains("z") ) {
				z++;
			} 
				
		}
		//���� ���� ���� ���� �˾Ƴ���
		int[] alpha = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
		String[] sss = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		int max = 0 ;
		int point = 0;
		String answer = null;
		//�ִ� Ƚ�� ���ϱ�
		for (int cnt = 0 ; cnt < alpha.length ; cnt++) {
			if ( max  <= alpha[cnt]) {
				max = alpha[cnt];
			}
		}
		
		for(int cnt = 0 ; cnt < alpha.length ; cnt ++) {
			if (max == alpha[cnt]) {
				answer = sss[cnt];
			}
		}
		
		//�ִ�Ƚ�� �ߺ� ���� �˻�
		for(int cnt = 0 ; cnt < alpha.length ; cnt ++) {
			if (max == alpha[cnt]) {
				point++;
			}
		}
		
		//���� ���� ���� ���� �Ǵ� ����ǥ ����ϱ�
		if ( point > 1 ) {
			System.out.println("?");
		} else if (point == 1 ) {
			System.out.println(answer);
		}
		
		sc.close();
		
	}
	
}
