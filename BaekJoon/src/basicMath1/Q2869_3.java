package basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int cnt = 1;
		
		while ( A < V ) {
			
			V = V-A;
			cnt++;
			
			if ( V > 0 ) {
				V = V + B;
			} else {
				break;
			}
			
		}
		
		System.out.println(cnt);
		
		br.close();
	}

}
