package arrangementTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		int A = Integer.parseInt(sc.nextLine());
		int B = Integer.parseInt(sc.nextLine());
		int C = Integer.parseInt(sc.nextLine());
		
		int ABC = A*B*C;
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		
		String abc = Integer.toString(ABC);
		
		String[] x = abc.split("");
		
		for ( int i = 0 ; i < x.length ; i ++ ) {
			list.add(x[i]);
		}
		
		for (int i = 0 ; i < list.size() ; i ++ ) {
			if (list.get(i).contains("0")) {
				zero++;
			} else if ( list.get(i).contains("1") ) {
				one++;
			} else if ( list.get(i).contains("2") ) {
				two++;
			} else if ( list.get(i).contains("3") ) {
				three++;
			} else if ( list.get(i).contains("4") ) {
				four++;
			} else if ( list.get(i).contains("5") ) {
				five++;
			} else if ( list.get(i).contains("6") ) {
				six++;
			} else if ( list.get(i).contains("7") ) {
				seven++;
			} else if ( list.get(i).contains("8") ) {
				eight++;
			} else if ( list.get(i).contains("9") ) {
				nine++;
			}
		
		}
		
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
		
		sc.close();
		
	}

}
