package Example;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner tf = new Scanner(System.in);
		System.out.println("논리 연산을 입력하세요>>");
		
		boolean a = tf.nextBoolean();
		String op = tf.next();
		boolean b = tf.nextBoolean();
		
		switch(op){
		case "AND":
			System.out.println(a);
			break;
			
		case "OR":
			System.out.println(b);
			break;
			
			default:
				System.out.println("다시 입력하시오.");
		}
		
	}
}
