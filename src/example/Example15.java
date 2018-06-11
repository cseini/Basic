package example;

public class Example15 {
	public static void main(String[] args) {
		System.out.println("   ##제2단##   ##제3단##   ##제4단##   ##제5단##   ##제6단##   ##제7단##   ##제8단##   ##제9단##\n");
		for(int i=1; i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%3d X %d = %2d", j,i,j*i);
			}
			System.out.println();
		}
	}
}
