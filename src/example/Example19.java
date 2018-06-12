package example;
import java.util.Scanner;

public class Example19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 여러개 입력 : ");
		int num = s.nextInt();
		int cnt = String.valueOf(num).length();
		int num_cnt = 0;
		/*for(int i=0;i<cnt;i++) {
			 num_cnt = num.charAt(i);
			 for(int j=0;j<num_cnt;j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		}*/
		System.out.println(num_cnt);
	}
}
