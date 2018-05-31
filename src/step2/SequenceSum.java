package step2;
import java.util.Scanner;
/**
기사시험문제 : [수열1] 1+2+3+...+100 까지의 합계
변형된 요구사항 :
정수를 입력받아 두 수 사이의 합을 구하는 프로그램을 구현하시오.
출력 : 1+2+3+...+10=55
 * */
public class SequenceSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("0.종료 1.시작 > ");
			switch(sc.nextInt()) {
			case 0: 
				System.out.println("종료합니다.");
			return;
			case 1:
				System.out.println("시작합니다.");
				System.out.print("첫번째 수를 입력해주세요.");
				int num1 = sc.nextInt();
				System.out.print("두번째 수를 입력해주세요.");
				int num2 = sc.nextInt();
				int tmp = 0, sum = 0;
				if(num1>num2) {
					System.out.println("수를 치환합니다.");
					tmp = num1;
					num1 = num2;
					num2 = tmp;
				}
				String result = "", opcode = "+";
				for(int i = num1; i <= num2;i++) {
					if(i==num2) {
						opcode = "=";
					}
					result += i + opcode;
					sum += i;
				}
				System.out.println(result+sum);
			break;
			default:
				System.out.println("잘못입력하셨습니다.");
			break;
			}
		}
	}
}
