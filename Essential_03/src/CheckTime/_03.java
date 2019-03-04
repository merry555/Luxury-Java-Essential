package CheckTime;

public class _03 {
	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		for(int k:num){
			sum+=k;
		}
		
		System.out.println("1~10까지의 합은 : "+sum);
	}
}
