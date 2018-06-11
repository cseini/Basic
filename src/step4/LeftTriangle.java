package step4;

public class LeftTriangle {
	public static void main(String[] args) {
		int k=0, max=0;
		int[][] mtx = new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				k++;
				mtx[i][j]=k;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.printf("%2d ",mtx[i][j]);
			}
			System.out.println();
		}
	}
	
}
