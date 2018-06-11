package example;

import java.util.Scanner;

public class Example18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		int upper_cnt=0, lower_cnt=0, num_cnt=0;
		String input = s.next();
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if('a'<=ch&&ch<='z') {
				lower_cnt++;
			}
			if('A'<=ch&&ch<='Z') {
				upper_cnt++;
			}
			if('0'<=ch&&ch<='9') {
				num_cnt++;
			}
		}
		System.out.printf("대문자 : %d개, 소문자 : %d개, 숫자 : %d개",upper_cnt,lower_cnt,num_cnt);
		
		
		
		
	}
}
