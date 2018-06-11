package step4;

public class SandGlass {
	public static void main(String[] args) {
		int k=0;
		int[][] mtx = new int[5][5];
		int min=0, max=5;
		for(int i=0;i<5;i++){
			if(i<3) {
				for(int j=min;j<max;j++) {
					k++;
					mtx[i][j]=k;
				}
				min++; max--;				
			} else {
				min--; max++;
				for(int j=min-1;j<max+1;j++) {
					k++;
					mtx[i][j]=k;
				}
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
