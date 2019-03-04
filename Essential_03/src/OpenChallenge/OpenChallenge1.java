package OpenChallenge;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge1 {
	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100);
		int i=1;
		
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("0~99");
		
		Scanner scr = new Scanner(System.in);
		
		
		while(true){
			System.out.println(i+">>");
			i++;
			int num = scr.nextInt();
			if(num<k){
				System.out.println("더 높게");
			} else if(num>k){
				System.out.println("더 낮게");
			} else if(num==k){
				System.out.println("맞았습니다.");
				System.out.println("다시하시겠습니까(y/n)");
				String scanner = scr.next();

				if(scanner.equals("n")){
					System.out.println("종료합니다.");
					break;
				}
			}
		}
	}
}
