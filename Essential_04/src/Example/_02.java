package Example;

import java.util.Scanner;

//name필드와 전화번호 (tel필트)를 가진 Phone클래스 이다.
//이름과 전화번호를 입력받아 2개의 Phone객체를 생성하고, 출력하는 main()매소드를 작

public class _02 {
	public static void main(String[] args) {
		Phone [] peopleArray;
		peopleArray = new Phone[2];
		
		Scanner scr = new Scanner(System.in);
		System.out.println("이름과 전화번호 입력>>");
		
		for(int i=0;i<peopleArray.length;i++) {
			String name = scr.next();
			String tel = scr.next();
			peopleArray[i] = new Phone(name,tel);
		}
		
		for(int i=0;i<peopleArray.length;i++) {
			System.out.println(peopleArray[i].getName()+" 의 번호 "+peopleArray[i].getTel());
		}
	}
}

class Phone {
	private String name,tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
		
	public String getName() { return name; }
	
	public String getTel() { return tel; }
}
