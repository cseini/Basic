package step1;
import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("얼마에요? ");
		int price = scan.nextInt();
		System.out.println(price+"원 입니다.");
		System.out.print("몇개 드릴까요? ");
		int many = scan.nextInt();
		System.out.println(many+"개 주세요.");
		int tprice = price * many;
		System.out.println("총 금액은 " +tprice+ "원 입니다.");
		System.out.println("비싸요. 깍아주세요.");
		System.out.print("몇 퍼센트 DC 할까요? ");
		int dc = scan.nextInt();
		String str = "안팔아요";
		if(dc<10){
			str = tprice*(100-dc)/100+"원 입니다.";
		}
		System.out.println(str);
	}
}