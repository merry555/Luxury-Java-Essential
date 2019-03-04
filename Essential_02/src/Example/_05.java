package Example;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요>>");
		String grade = g.next();
		
		switch(grade){
		case "A": case "B":
			System.out.println("Excellent");
			break;
			
		case "C": case "D":
			System.out.println("Good");
			break;
			
		case "F":
			System.out.println("Bye");
			break;
			
			default:
				System.out.println("다시 입력하세요.");
		}
		
	}
}
