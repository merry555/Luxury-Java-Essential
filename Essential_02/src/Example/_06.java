package Example;

import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		Scanner sam = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하세요>>");
		int num = sam.nextInt();
		
		int first = num/10;
		int second = num%10;
		
		if(first==3||first==6||first==9||second==3||second==6||second==9){
			System.out.println("박수짝짝");
		} else if(first==3&&first==6&&first==9&&second==3&&second==6&&second==9){
			System.out.println("박수짝");
		} else
			System.out.println("박수없음");
		
	}
}
