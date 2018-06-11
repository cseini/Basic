package example;
import java.util.Scanner;

public class Example17 {
	public static void main(String[] args) {
		int result = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("합계의 시작값 ==> ");
		int snum = s.nextInt();
		System.out.print("합계의 끝값 ==> ");
		int endnum = s.nextInt();
		System.out.print("배수 ==> ");
		int multi = s.nextInt();
		for(int i=snum;i<=endnum;i++) {
			if(i%multi==0) {
				result+=i;
			}
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==>%d", snum, endnum, multi, result);
		
		
	}
}
