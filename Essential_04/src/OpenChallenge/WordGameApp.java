package OpenChallenge;

import java.util.Scanner;

//참가자의 수를 입력받아 Player[]배열 생
public class WordGameApp {
	public static void main(String[] args) {
		Player ply = new Player();
		
		Scanner peo = new Scanner(System.in);
		
		System.out.println("게임에 참가하는 인원은 몇명입니까>>");
		int num = peo.nextInt();
		
		Player[] play;
		play = new Player[num];
		int i=0;
		
		for(i=0;i<=play.length;i++) {
			System.out.println("참가자의 이름을 입력하세요.>>");
			play[i] = new Player();
			play[i].name = peo.next();
		}
				
		System.out.println("시작하는 단어는 아버지 입니다.");
		while(true) {
			System.out.println(play[i].name+">>");
			ply.sayWord();
			ply.succeed();
			if(ply.succeed()==false) {
				System.out.println(play[i].name+"이 졌습니다.");
				break;
			}
		}
	}
}
