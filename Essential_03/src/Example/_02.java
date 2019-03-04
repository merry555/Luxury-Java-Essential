package Example;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int i=0;
		int num[] = new int[10];
		
		System.out.println("정수 10개 입력>>");
		
		for(i=0;i<10;i++){
			num[i] = scr.nextInt();
			
			if(num[i]%3==0){
				System.out.print(num[i]+" ");
			}
		}
	}
}
