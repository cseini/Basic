package example;
import java.util.Scanner;
public class Example8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 0, num2=0;
		num1 = s.nextInt();
		num2 = s.nextInt();
		System.out.printf("%d + %d = %d \n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d \n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d \n",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d \n",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d \n",num1,num2,num1%num2);
	}
}
