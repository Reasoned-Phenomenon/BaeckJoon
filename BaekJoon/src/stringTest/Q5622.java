package stringTest;

import java.util.Scanner;

public class Q5622 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] ss = s.split("");
		int time = 0; 
		
		for (int i = 0 ; i < ss.length ; i++) {
			if (ss[i].contains("A")||ss[i].contains("B")||ss[i].contains("C")) {
				time +=3;
			} else if (ss[i].contains("D")||ss[i].contains("E")||ss[i].contains("F")) {
				time +=4;
			} else if (ss[i].contains("G")||ss[i].contains("H")||ss[i].contains("I")) {
				time +=5;
			} else if (ss[i].contains("J")||ss[i].contains("K")||ss[i].contains("L")) {
				time +=6;
			} else if (ss[i].contains("M")||ss[i].contains("N")||ss[i].contains("O")) {
				time +=7;
			} else if (ss[i].contains("P")||ss[i].contains("Q")||ss[i].contains("R")||ss[i].contains("S")) {
				time +=8;
			} else if (ss[i].contains("T")||ss[i].contains("U")||ss[i].contains("V")) {
				time +=9;
			} else if (ss[i].contains("W")||ss[i].contains("X")||ss[i].contains("Y")||ss[i].contains("Z")) {
				time +=10;
			}
		}
		
		System.out.println(time);
		
		sc.close();
		
	}

}
