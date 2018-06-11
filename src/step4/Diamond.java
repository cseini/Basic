package step4;

public class Diamond {
	public static void main(String[] args) {
		int k=0;
		int[][] mtx = new int[5][5];
		int min=3, max=2;
		for(int i=0;i<5;i++){
			if(i<3) {
				min--; max++;				
			} else {
				min++; max--;
			}
			for(int j=min;j<max;j++) {
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
