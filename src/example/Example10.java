package example;
import java.util.Scanner;
public class Example10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int year = 0;
		System.out.print("연도입력 : ");
		year = s.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.printf("%d년은 윤년입니다.",year);
		} else {
			System.out.printf("%d년은 평년입니다.",year);
		}
	}
}
