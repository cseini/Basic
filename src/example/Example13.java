package example;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result=0;
		System.out.println("input(한줄로 띄어쓰기로) : ");
		String[] input = s.nextLine().split(" ");
		System.out.println(input[2]);
		switch (input[1]) {
		case "+":
			result = Integer.parseInt(input[0])+Integer.parseInt(input[2]);
			break;
		case "-":
			result = Integer.parseInt(input[0])-Integer.parseInt(input[2]);
			break;
		case "*":
			result = Integer.parseInt(input[0])*Integer.parseInt(input[2]);
			break;
		case "/":
			result = Integer.parseInt(input[0])/Integer.parseInt(input[2]);
			break;
		case "%":
			result = Integer.parseInt(input[0])%Integer.parseInt(input[2]);
			break;
		default:
			System.out.println("연산자....");
			return;
		}
		System.out.printf("%s %s %s = %d", input[0], input[1], input[2], result);
	}
}