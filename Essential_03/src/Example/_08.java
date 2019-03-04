package Example;

import java.util.Scanner;
///질문!!!! 배열에 문제가 있는 오류 코드..배열
public class _08 {
	public static void main(String[] args) {
		String computer[] ={"가위","바위","보"};
		
		
		Scanner p = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int index =(int)(Math.random()*3);
			
			System.out.println("가위 바위 보!>>");
			String me = p.next();
		
			System.out.println("컴퓨터는"+computer[index]+" 나는"+me+"입니다.");
			if(computer[index].equals("가위") && me.equals("바위")){
				System.out.println("사용자 ="+me+"컴퓨터"+computer[index]+","+"사용자가 이겼습니다.");
			} 
			else if (computer[index].equals("가위") && me.equals("보")){
				System.out.println("사용자 ="+me+" 컴퓨터"+computer[index]+","+"컴퓨가 이겼습니다.");
			} 
			else if (computer[index].equals("바위") && me.equals("가위")){
				System.out.println("사용자 ="+me+" 컴퓨터"+computer[index]+","+"컴퓨터가 이겼습니다.");
			} 
			else if(computer[index].equals("바위") && me.equals("보")){
				System.out.println("사용자 ="+me+" 컴퓨터"+computer[index]+","+"사용자가 이겼습니다.");
			}
			else if(computer[index].equals("보") && me.equals("바위")){
				System.out.println("사용자 ="+me+" 컴퓨터"+computer[index]+","+"컴퓨터가 이겼습니다.");
			}
			else if(computer[index].equals("보") && me.equals("가위")){
				System.out.println("사용자 ="+me+" 컴퓨터"+computer[index]+","+"사용자가 이겼습니다.");
			}
			else if (me.equals("그만")){
				System.out.println("게임을 종료합니다.");
				break;
			}
			else
				System.out.println("비겼습니다.");
		}
	}
}

