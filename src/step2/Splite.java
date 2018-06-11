package step2;
import java.util.Scanner;
public class Splite {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("input first");
		int num = s.nextInt();
		System.out.println("input seconde");
		int num1 = s.nextInt();
		System.out.println("input third");
		int num2 = s.nextInt();
		String numString = num +" "+ num1 +" "+ num2;
		String[] numArr = numString.split(" ");
		System.out.println(numString);
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);		
		System.out.println(numArr[2]);
	}
} 

