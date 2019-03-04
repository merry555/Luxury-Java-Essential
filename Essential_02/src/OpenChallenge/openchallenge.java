package OpenChallenge;

import java.util.Scanner;

public class openchallenge {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임 입니다. 가위, 바위 보 중에서 입력하세요");
		System.out.println("철수>>");
		String a = var.next();
		System.out.println("영희>>");
		String b = var.next();
		
		if(a.equals("가위")&&b.equals("바위")){
			System.out.println("영희가 이겼습니다.");
		} else if(a.equals("가위")&&b.equals("보")){
			System.out.println("철수가 이겼습니다.");
		} else if(a.equals("바위")&&b.equals("가위")){
			System.out.println("철수가 이겼습니다.");
		} else if(a.equals("바위")&&b.equals("보")){
			System.out.println("영희가 이겼습니다.");
		} else if(a.equals("보")&&b.equals("가위")){
			System.out.println("영희가 이겼습니다.");
		} else if(a.equals("보")&&b.equals("바위")){
			System.out.println("철수가 이겼습니다.");
		} else{
			System.out.println("비겼습니다.");
		}
		
	}
}
