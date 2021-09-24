package stringTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss= s.split("");
		
		List<String> list = new ArrayList<>();
		
		for ( int i = 0 ; i < ss.length ; i++) {
			
			list.add(ss[i]);
			
		}
		
		
		
		
		sc.close();
		
		
	}

}
