package Example;
//질문!!! eng랑 kor이랑 1대1로 대응 시키는 방->index
import java.util.Scanner;

public class _06 {
	public static void main(String[] args) {
		String eng[]={"student","love","java","happy","future"};
		String kor[]={"학생","사랑","자바","행복한","미래"};
		
		Scanner scr = new Scanner(System.in);
		
		while(true) {
			System.out.println("영어 단어를 입력하세요.>>");
			String word = scr.next();
			
			for(int i=0;i<eng.length;i++) {
				if(word.equals(eng[i])) {
					System.out.println(kor[i]);
				}
				else if(!word.equals(eng[i])&&i==eng.length) {
					System.out.println("그런 단어는 없습니다.");
				}
			}
			
			if(word.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				scr.close();
				break;
			}
		}
	}
}
