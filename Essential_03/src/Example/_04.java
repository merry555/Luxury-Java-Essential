package Example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		char day[] = {'일', '월', '화', '수', '목', '금', '토'};
		
		Scanner scr = new Scanner(System.in);
		while(true){
		try{
			int n=0;
			
			System.out.println("정수를 입력하세요.>>");
			n = scr.nextInt();
			
			for(int i=0;i<=7;i++){
				if(n%7==i){
					System.out.println(day[i]);
				} 
			}
			if(n<0){
				scr.close();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} catch(InputMismatchException e){
			System.out.println("경고! 수를 입력하지 않았습니다.");
			break;
		} 
		}
	}
}
