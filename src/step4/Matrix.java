package step4;

import javax.swing.JOptionPane;
enum Butt {
	EXIT,
	LEFT_TRIANGLE,
	RIGHT_TRIANGLE,
	ZIGZAG,
	DIAMOND,
	SAND_GLASS,
	TRIANGLE,
	DIAGONAL,
	SNAIL,
	MAGIC_SQUARE,
	MATRIX_CONVERSION;
}
public class Matrix {
	public static String leftTriangle() {
		String result = "";
		int k=0;
		int[][] mtx = new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				k++;
				mtx[i][j]=k;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				result += mtx[i][j] +" ";
			}
			result+="\n";
		}
		return result;
	}
	public static String rightTriangle() {
		String result = "";
		int k=0, max=5;
		int[][] mtx = new int[5][5];
		for(int i=0;i<5;i++){
			max--;
			for(int j=max;j<5;j++){
				k++;
				mtx[i][j]=k;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				result += mtx[i][j];
			}
			result += "\n";
		}
		return result;
	}
	public static String zigzag() {
		String result ="";
		int k=0, min=0, max=5;
		int[][] mtx = new int[5][5];
		for(int i=0;i<5;i++){
			if(i%2==0) {
				for(int j=0;j<5;j++){
					k++;
					mtx[i][j]=k;
				}
			} else {
				for(int j=4;j>=0;j--) {
					k++;
					mtx[i][j]=k;
				}
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				result+=mtx[i][j];
			}
			result+="\n";
		}
		return result;
	}
	public static String diamond() {
		String result = "";
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
				result +=mtx[i][j];
			}
			result+="\n";
		}
		return result;
	}
	public static String sandGlass() {
		String result = "";
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
				result+=mtx[i][j];
			}
			result+="\n";
		}
		return result;
	}
	public static String triangle() {
		String result = "";
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
				result+=mtx[i][j];
			}
			result+="\n";
		}
		return result;
	}
	public static String diagonal() {
		String result = "";
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
				result += mtx[i][j];
			}
			result += "\n";
		}
		return result;
	}
	public static String snail() {
		String result = "";
		int[][] mtx = new int[5][5];
		int k=0, x=0, y=-1, a=1, max=5;
		for(int i=0; i<5; i++) {
			for(int j=0;j<max;j++) {
				y=y+a;
				k++;
				mtx[x][y] = k;
			}
			max--;
			for(int j=0;j<max;j++) {
				x=x+a;
				k++;
				mtx[x][y] = k;
			}
			a=a*(-1);
		}
		for(int i = 0 ; i<5;i++) {
			for(int j =0; j<5;j++) {
				result+=mtx[i][j];
			}
			result+="\n";
		}
		return result;
	}
	public static String magicSquare() {
		return "";
	}
	public static String matrixConversion() {
		return "";
	}
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.LEFT_TRIANGLE,
				Butt.RIGHT_TRIANGLE,
				Butt.ZIGZAG,
				Butt.DIAMOND,
				Butt.SAND_GLASS,
				Butt.TRIANGLE,
				Butt.DIAGONAL,
				Butt.SNAIL,
				Butt.MAGIC_SQUARE,
				Butt.MATRIX_CONVERSION
			};
		while (true) {
			Butt select = (Butt)JOptionPane.showInputDialog(
					null, //frame
					"MATRIX PAGE", //frame title
					"SELECT MATRIX MENU", //order
					JOptionPane.QUESTION_MESSAGE, //type
					null, // icon
					buttons, //Array of choices
					buttons[1] // default
					);
			switch (select) {
			case EXIT:
				return;
			case LEFT_TRIANGLE:
				JOptionPane.showMessageDialog(null,leftTriangle());
				break;
			case RIGHT_TRIANGLE:
				JOptionPane.showMessageDialog(null,rightTriangle());
				break;
			case ZIGZAG:
				JOptionPane.showMessageDialog(null,zigzag());
				break;
			case DIAMOND:
				JOptionPane.showMessageDialog(null,diamond());
				break;
			case SAND_GLASS:
				JOptionPane.showMessageDialog(null,sandGlass());
				break;
			case TRIANGLE:
				JOptionPane.showMessageDialog(null,triangle());
				break;
			case DIAGONAL:
				JOptionPane.showMessageDialog(null,diagonal());
				break;
			case SNAIL:
				JOptionPane.showMessageDialog(null,snail());
				break;
			case MAGIC_SQUARE:
				JOptionPane.showMessageDialog(null,magicSquare());
				break;
			case MATRIX_CONVERSION:
				JOptionPane.showMessageDialog(null,matrixConversion());
				break;
			default:
				break;
			}
		}
	}
}
