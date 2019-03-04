package Example;

public class _07 {
	public static void main(String[] args) {
		for(int i=0;i<=99;i++){
			if((i%10==3&&i/10==3)||(i%10==3&&i/10==6)||(i%10==3&&i/10==9)){
				System.out.println(i+"박수두번");
			} else if((i%10==6&&i/10==3)||(i%10==6&&i/10==6)||(i%10==6&&i/10==9)){
				System.out.println(i+"박수두번");
			} else if((i%10==9&&i/10==3)||(i%10==9&&i/10==6)||(i%10==9&&i/10==9)){
				System.out.println(i+"박수두번");
			} else if(i%10==3||i%10==6||i%10==9){
				System.out.println(i+"박수 한번");
			}
	}
	}
}
