package example;
import java.util.Scanner;
public class Example16 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("변환할 글자 입력");
		String input = s.nextLine();
		for(int i = input.length()-1;i>=0;i--) {
			System.out.print(input.charAt(i));	
		}
	}
}

