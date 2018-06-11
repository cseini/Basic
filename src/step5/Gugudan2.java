package step5;

public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 9; i >=0 ; i--) {
			for (int j =9 ; j >= 2; j--) {
				System.out.printf("%3d X %d = %2d",j,i,i*j);
			}
			System.out.println();
		}
	}
}
