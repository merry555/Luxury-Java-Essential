package Example;
//학교컴터로 다시확인
import java.util.Scanner;

//이름(name)과 전화번호(tel) 필드, 생성자 및 필요한 메소드를 가진 Phone클래스를 작성하고
//main()을 가진 PhoneManager클래스를 작성,
//한 사람의 전화번호는 하나의 Phone객체로 다룬다.

class IPhone {
	private String name,tel;
	
	public IPhone (String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() { return name; }
	public String getTel() { return tel; }
}

public class _04 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("인원수>>");
		int num = scr.nextInt();
		int i = 0;
		
		IPhone peopleArray[];
		peopleArray = new IPhone[num];
		
		for(i=0;i<peopleArray.length;i++) {
			System.out.println("이름과 전화번호(번호는 연속적으로 입력)>>");
			String name = scr.next();
			String tel = scr.next();
			peopleArray[i] = new IPhone(name,tel);
		}
		System.out.println("저장되었습니다...");
	
		while(true) {
			System.out.println("검색할 이름>>");
			String findname = scr.next();
			
			for(i=0;i<peopleArray.length;i++) {
				if(findname.equals(peopleArray[i].getName())) {
					System.out.println(peopleArray[i].getName()+"의 번호는"+peopleArray[i].getTel()+"입니다.");
				}
				break;
			}
			if (i==peopleArray.length) {
				System.out.println(findname+"이 없습니다.");
			}
			if (findname.equals("exit"))
				break;
		}
	}
}
