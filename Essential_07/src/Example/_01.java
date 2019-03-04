package Example;

import java.util.Scanner;
import java.util.Vector;

public class _01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int max = 0;
		int n = 0;
		
		for(int i=0; i<5; i++) {
			Scanner scanner = new Scanner(System.in);
			v.add(scanner.nextInt());
			n = v.get(i);
		
			if(max > n) {
				max = n;
			}
		}
		System.out.println("가장 큰 수는 : " + n);
	}
}
