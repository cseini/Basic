package step4;

public class Triangle {
	public static void main(String[] args) {
		int k=0;
		int[][] mtx = new int[7][4];
		int imin=0, imax=0, jmin=3, jmax=4;
		for(int i=0;i<4;i++){
			for(int j=jmin;j<jmax;j++) {
				k++;
				mtx[j][i]=k;
			}
			jmin--; jmax++;
		}
		for(int i=0;i<7;i++){
			for(int j=0;j<4;j++){
				System.out.printf("%2d ",mtx[i][j]);
			}
			System.out.println();
		}
	}

}
