package OpenChallenge;
// 게임 참가자의 이름 필드와 사용자로부터 단어를 입력받는 String word()메소드, 끝말잇기에 성공하였는지를 판별하고
// 게임을 계속하는지를 판별하는 boolean succeed()메소드.
import java.util.Scanner;

public class Player {
	String name;
	
	public String sayWord() {
		Scanner scr = new Scanner(System.in);
		String word = scr.next();
		
		return word;
	}
	
	public boolean succeed() {
		String word = "아버지";
		int lastIndex = word.length(); // 마지막 문자에 대한 인덱스
		char lastChar = word.charAt(lastIndex); // 마지막 문자
		char firstChar = word.charAt(0); //첫번째 문자
		
		if(lastChar==firstChar) {
			return true;
		}
		else 
			return false;
		
	}
}
