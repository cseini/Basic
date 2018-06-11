package step4;

public class Digonal {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0, x = 0, y = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				y= i-j;
				if(0<=y&&y<5) {
				k++;
				mtx[j][y]=k;
				}
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%3d", mtx[i][j]);
			}
			System.out.println();
		}
	}
}
