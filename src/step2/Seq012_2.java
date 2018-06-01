package step2;
import java.util.Scanner;
/**
 * [수열012] 홀수짝수의 합계(메소드 분할)
 */
public class Seq012_2 {
	public static void input(Scanner sc){
		int tmp = 0;
		System.out.println("홀수합 시작합니다.");
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("숫자를 치환합니다.");
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		while (true) {
			System.out.println("0.종료 1.홀수합 2. 짝수합 > ");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				input(sc);
				int num1 = 0, num2=0, count=0, totalCount=0, sum=0;
				String result = "", opcode ="";
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 1) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 1) {
						count++;
						if (count == totalCount) {
							opcode = "=";
						}
						result += i + opcode;
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			case 2:
				num1 = 0; num2=0; count=0; totalCount=0; sum=0;	result = ""; opcode ="";
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0) {
						count++;
					}
					totalCount=count;
					count = 0;
				}
				for (int i = num1; i <= num2; i++) {
					if (i % 2 == 0) {
						if (count==totalCount) {
							opcode = "=";
						}
						result += i + opcode;
						sum += i;
					}
				}
				System.out.println(result + sum);
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
}