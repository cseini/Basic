package step2;

import java.util.Scanner;

public class Seq010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("0.종료 1.실행 > ");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				String result = "", opcode = "+";
				int sum = 0, tmp = 0, num1 = 0, num2 = 0;
				System.out.println("시작합니다.");
				System.out.println("첫번째 숫자를 입력하세요.");
				num1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				num2 = sc.nextInt();
				if (num1 > num2) {
					System.out.println("숫자를 치환합니다.");
					tmp = num1;
					num1 = num2;
					num2 = tmp;
				}
				for (int i = num1; i <= num2; i++) {
					if (i == num2) {
						opcode = "=";
					}
					result += i + opcode;
					sum += i;
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