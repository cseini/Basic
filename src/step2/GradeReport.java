package step2;
import java.util.Scanner;
public class GradeReport {
	public static int[] input(Scanner scan) {
		int[] result = new int[3];
		System.out.print("국어점수? : ");
		result[0] = scan.nextInt();
		System.out.print("영어점수? : ");
		result[1] = scan.nextInt();
		System.out.print("수학점수? : ");
		result[2] = scan.nextInt();
		return result;
	}
	public static int[] score(int[] input) {
		int[] result = new int[2];
		int sum = input[0]+input[1]+input[2], avr = sum/3;
		result[0]=sum;
		result[1]=avr;
		return result;
	}
	public static String grade(int[] score) {
		String result = "", grade = "";
		switch(score[1]/10){
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			case 5: grade = "E"; break;
			default :grade = "F"; break;
		}
		result = grade;
		return result;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 ?\n");
		String name = scan.next();
		int[] score = score(input(scan));
		String grade = grade(score);
		int sum=score[0], avr=score[1];
		System.out.printf("*********************************************\n");
		System.out.printf("|   이름   |   총점   |   평균   |   등급   |\n");
		System.out.printf("---------------------------------------------\n");
		System.out.printf("|  %s  |   %d    |    %d   |    %s     |\n",name, sum, avr, grade);
		System.out.printf("*********************************************\n");
	}
}
