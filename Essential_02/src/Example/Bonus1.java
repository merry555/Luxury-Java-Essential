package Example;

import java.util.Scanner;

public class Bonus1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("식을 입력하세요>>");
		double op1 = scanner.nextDouble();
		String operator = scanner.next();
		double op2 = scanner.nextDouble();
		double result = 0;
		
		switch(operator){
		case "+":
			result = op1+op2;
			break;
			
		case "-":
			result = op1-op2;
			break;
			
		case "*":
			result = op1*op2;
			break;
			
		case "/":
			result = op1/op2;
			break;
			
			default:
				System.out.println("다시 입력하시오.");
		}
		
		System.out.println("연산 결과"+result);
	}
}
