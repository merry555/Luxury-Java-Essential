package Example;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner mon = new Scanner(System.in);
		
		System.out.println("돈의 액수를 입력하세요>>");
		int money = mon.nextInt();
		
		int fman = money/50000;
		int man = (money%50000)/10000;
		int chun = (money%50000%10000)/1000;
		int fbaek = (money%50000%10000%1000)/500;
		int baek = (money%50000%10000%1000%500)/100;
		int ten = (money%50000%10000%1000%500%100)/10;
		int one = (money%50000%10000%1000%500%100%10)/1;
		
		System.out.println("오만원"+fman+"개,"+"만원"+man+"개,"+
							"천원"+chun+"개,"+"500원"+fbaek+"개,"+
							"100원"+baek+"개,"+"10원"+ten+"개,"+"1원"+one+"개,");
	}
}
