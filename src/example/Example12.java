package example;
import java.util.Scanner;
public class Example12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1 = 0, num2=0, result=0;
		String opcode = "";
		System.out.println("num1");
		num1=s.nextInt();
		System.out.println("opcode");
		opcode=s.next();
		System.out.println("num2");
		num2=s.nextInt();
		if(opcode.equals("+")) {
			result = num1+num2;
		} else if(opcode.equals("-")) {
			result = num1-num2;
		} else if(opcode.equals("*")) {
			result = num1*num2;
		} else if(opcode.equals("/")) {
			result = num1/num2;
		} else if(opcode.equals("%")) {
			result = num1%num2;
		} else {
			System.out.println("연산자 확인해");
			return;
		}
		System.out.printf("%d %s %d = %d",num1,opcode,num2,result);
	}
}