package Example;

import java.util.Scanner;

public class _05 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int n[] = new int[10];
		
		
		System.out.println("정수 10개 입력>>");
		
		for(int i=0;i<n.length;i++){
			n[i]=scr.nextInt();
			}
		
		for(int i=0;i<n.length;i++){
			for(int j=0;j<n.length;j++){
				if(n[i]>n[j]){
					int tmp =n[i];
					n[i]=n[j];
					n[j]=tmp;
				}
			}
		}
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+" ");
		}
		scr.close();
	}
}
