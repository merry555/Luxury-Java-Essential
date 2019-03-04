package CheckTime;

public class _04 {
	public static void main(String[] args) {
		int intArray[][] = new int [4][];
		intArray[0] = new int [4];
		intArray[1] = new int [1];
		intArray[2] = new int [1];
		intArray[3] = new int [4];
		
		int k=0;
		
		for(int i=0;i<intArray[0].length;i++){
			intArray[0][i]=k++;
		}
		intArray[1][0]=k++;
		intArray[2][0]=k++;
		
		for(int j=0;j<intArray[3].length;j++){
			intArray[3][j]=k++;
		}
		
		for(int i=0;i<intArray.length;i++){
			for(int j=0;j<intArray[i].length;j++)
				System.out.print(intArray[i][j]+" ");
		System.out.println();
		}
	}
}
