package Example;

import java.util.Scanner;

//사각형을 표한하는 다음 Rect클래스를 활용하여, Rect객체 배열을 생성하고,
//사용자로부터 4개의 사각형을 입력받아 배열에 저장한 뒤, 배열을 검색하여 사각형 면적의
//합을 출력하는 main() 메소드를 가진 RectArray클래스를 작성하라.

public class _03 {
	public static void main(String[] args) {
		Rect reArray[];
		reArray = new Rect[4];
		
		Scanner scr = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		
		for(int i=0;i<reArray.length;i++) {
			System.out.println(count+"너비와 높이 >>");
			int width = scr.nextInt();
			int height = scr.nextInt();
			reArray[i] = new Rect(width,height);
			count++;
		}
		System.out.println("저장하였습니다...");
		
		for(int i=0;i<reArray.length;i++) {
			sum+=reArray[i].getArea();
		}
		System.out.println("사각형 전체 합은 "+sum);
	}
}

class Rect {
	private int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() { return width*height; }

}
