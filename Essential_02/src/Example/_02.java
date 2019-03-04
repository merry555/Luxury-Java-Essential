package Example;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {
		Scanner xy = new Scanner(System.in);
		
		System.out.println("점 (x,y)의 좌표를 입력하세요");
		int x = xy.nextInt();
		int y = xy.nextInt();
		
		if(x<100&&x>50){
			System.out.println("점"+"("+x+","+y+")"+"은"+"(50,50)과(100,100)의 사각형 내에 있습니다.");
		} else
			System.out.println("점"+"("+x+","+y+")"+"은"+"(50,50)과(100,100)의 사각형밖에 있습니다.");
	}
}
