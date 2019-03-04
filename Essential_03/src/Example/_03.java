package Example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요>>");
		
		try{
			int num = scr.nextInt();
			if(num%2==0){
				System.out.println("짝수");
			}
		} catch(InputMismatchException e){
			System.out.println("수를 입력하지 않아 프로그램이 종료됩니다.");
		} finally{
			scr.close();
		}
	}
}
