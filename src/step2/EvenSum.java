package step2;
import java.util.Scanner;
/**
1부터 10까지 의 합을 구하시오.
출력은 1+2+3+......10=55 입니다.
 * */
public class EvenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.시작 > ");
			switch(sc.nextInt()){
			case 0:
				System.out.println("종료합니다.");
				return;
			case 1:
				System.out.println("시작합니다.");
				System.out.println("첫번째 숫자를 입력하세요.");
				int num1 = sc.nextInt();
				System.out.println("두번쨰 숫자를 입력하세요.");
				int num2 = sc.nextInt();
				int sum = 0, tmp = 0;
				if(num1>num2) {
					System.out.println("숫자를 치환합니다.");
					tmp = num1;
					num1 = num2;
					num2 = tmp;
				}
				String result = "", opcode = "+";
				for(int i = num1;i<=num2;i++){
					if(i%2==0) {
						if(i==num2||i==num2+1||i==num2-1){
							opcode = "=";
						}
						result += i + opcode;
						sum += i;
					}
				}
				System.out.println(result+sum);
				break;
			default: System.out.println("잘못입력하셨습니다.");break;
			}
		}
	}
}
