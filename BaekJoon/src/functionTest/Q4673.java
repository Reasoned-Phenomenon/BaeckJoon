package functionTest;

import java.util.ArrayList;
import java.util.List;

public class Q4673 {
	
	
	public static void main(String[] args) {
		Q4673.d();
	}

	public static void d () {
		
		List<Integer> list = new ArrayList<>();
		
		for ( int n = 0 ; n <=10000 ; n++) {
			
			if ( n < 10 ) {
				
				list.add(2*n);
				
			} else {
				
				String s = Integer.toString(n);
				String[] ss = s.split("");
				int sum = 0;
				
				for ( int i = 0 ; i < ss.length ; i++) {
					sum += Integer.parseInt(ss[i]);
				}
				
				list.add(n+sum);
			}
			
		}
		
		for(int i = 0 ; i <=10000 ; i++) {
			
			if (!list.contains(i)) {
				
				System.out.println(i);
			} 
		}
		
		
	}
}
