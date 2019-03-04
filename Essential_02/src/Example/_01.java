package Example;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		Scanner add = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하시오.>>");
		
		int a = add.nextInt();
		int b = add.nextInt();
		
		int sum = a+b;
		
		System.out.println(a+"+"+b+"은"+sum);
	}
}
