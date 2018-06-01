package step2;
import java.util.Scanner;
/**
 * [수열012] 홀수짝수의 합계(메소드 분할)
 */
public class Seq012_3 {
	public static int[] input(Scanner sc) {
		int[] result = new int[2];
		System.out.println("첫번째 숫자를 입력하세요.");
		result[0] = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		result[1] = sc.nextInt();
		int tmp;
		if (result[0] > result[1]) {
			tmp = result[0];
			result[0] = result[1];
			result[1] = tmp;
		}
		return result;
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
				int[] arr = input(sc);
				int count = 0, totalCount = 0, sum = 0;
				System.out.println("홀수합 시작합니다.");
				String result = "", opcode = "+";
				for (int i = arr[0]; i <= arr[1]; i++) {
					if (i % 2 == 1) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = arr[0]; i <= arr[1]; i++) {
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
				System.out.println("짝수합 시작합니다.");
				count = 0;
				totalCount = 0;
				sum = 0;
				result = "";
				opcode = "+";
				arr = input(sc);
				for (int i = arr[0]; i <= arr[1]; i++) {
					if (i % 2 == 0) {
						count++;
					}
				}
				totalCount = count;
				count = 0;
				for (int i = arr[0]; i <= arr[1]; i++) {
					if (i % 2 == 0) {
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
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
}