package step1;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter OPCODE(+ = 1 ,- = 2, * = 3, / = 4, % = 5) : ");
		int opcode = scan.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2 = scan.nextInt();
		int result = 0;
		String opcode1 = "";
		if(opcode==1){
			result = num1 + num2;
			opcode1 = "+";
		}else if(opcode==2){
			result = num1 - num2;
			opcode1 = "-";
		}else if(opcode==3){
			result = num1 * num2;
			opcode1 = "*";
		}else if(opcode==4){
			result = num1 / num2;
			opcode1 = "/";
		}else{
			result = num1 % num2;
			opcode1 = "%";
		}
		if(1<=opcode&&opcode<=5){
			System.out.println(num1 + " " + opcode1 + " " + num2 + " = " + result);
		} else {
			System.out.println("연산자 입력 범위를 벗어났습니다.");
		}
	}
}