package step4;

public class MagicSquare {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k = 0, x = 1, y = 1,min=0,max=5,a=1;
		for (int i = 0; i < 5; i++) {
			for (int j = min; j < max; j++) {
				x--;
				x=(x==-1)?4:x;
				y+=a;
				y=(y==5)?0:y;
				k++;
				mtx[x][y] = k;
			}
			x+=a;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mtx[i][j] + " ");
			}
			System.out.println();
		}
	}
}
