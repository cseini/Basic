package step4;

public class Snail {
	public static void main(String[] args) {
		int k = 0;
		int[][] mtx = new int[5][5];
		int x = 0, y = -1, max = 5, a=1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < max; j++) {
				y=y+a;
				k++;
				mtx[x][y]=k;
			}
			max--;
			for (int j = 0; j < max; j++) {
				x=x+a;
				k++;
				mtx[x][y]=k;
			}
			a=a*(-1);
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",mtx[i][j]);
			}
			System.out.println();
		}
	}
}