package step1;
import java.util.Scanner;
public class Series {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 >");
			switch(scan.nextInt()){
				case 0:
				System.out.println("종료합니다.");
				return;
				case 1:
				System.out.println("시작합니다.");
				System.out.print("첫번째 숫자를 입력 > ");
				int num1 = scan.nextInt();
				System.out.print("두번째 숫자를 입력 > ");
				int num2 = scan.nextInt();
				String result = "", opcode = "+";
				int sum = 0, tmp = 0;
				if(num1>num2){
					System.out.println("값을 치환합니다.");
					tmp = num1;
					num1 = num2;
					num2 = tmp;
				}
				for(int i=num1;i<=num2;i++){
					if(i==num2){
						opcode = "=";
					}
					result += i+opcode;
					sum+=i;
				}
				System.out.println(result+sum);
				break;
				default :System.out.println("ERROR");break;
			}
		}
	}
}