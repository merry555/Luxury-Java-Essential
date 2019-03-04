package Example;

import java.util.ArrayList;
import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		String score = null;
		double num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("빈 칸을 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		
		for(int i=0; i<5; i++) {
			score = scanner.next();
			s.add(i,score);
			
			if(score == "A")
				num = 4.0;
			else if(score == "B")
				num = 3.0;
			else if(score == "C")
				num = 2.0;
			else if(score == "F")
				num = 1.0;
		}

		for(int i=0; i<5; i++) {
			s.get(i);
			System.out.print( num + " ");
		}
	}
}
