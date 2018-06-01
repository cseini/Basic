package step2;
import java.util.Scanner;
public class GradeReport_String {
	public static String input(Scanner scan) {
		String result = "";
		int kor = 0, eng = 0, math = 0;
		System.out.print("국어점수? : ");
		kor = scan.nextInt();
		System.out.print("영어점수? : ");
		eng = scan.nextInt();
		System.out.print("수학점수? : ");
		math = scan.nextInt();
		result = kor+","+eng+","+math;
		return result;
	}
	public static String score(String input) {
		String str = input;
		String[] strs = str.split(",");
		int kor = Integer.parseInt(strs[0]);
		int eng = Integer.parseInt(strs[1]);
		int math = Integer.parseInt(strs[2]);		
		int sum = kor+eng+math, avr = sum/3;
		String sumavr = sum+","+avr;
		return sumavr;
	}
	public static String grade(String score) {
		String result = "", grade = "";
		String[] scores = score.split(",");
		int sum = Integer.parseInt(scores[0]);
		int avr = Integer.parseInt(scores[1]);
		switch(avr/10){
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
		String score = score(input(scan));
		String grade = grade(score);
		String[] scores = score.split(",");
		int sum = Integer.parseInt(scores[0]);
		int avr = Integer.parseInt(scores[1]);
		System.out.printf("*********************************************\n");
		System.out.printf("|   이름   |   총점   |   평균   |   등급   |\n");
		System.out.printf("---------------------------------------------\n");
		System.out.printf("|  %s  |   %d    |    %d   |    %s     |\n",name, sum, avr, grade);
		System.out.printf("*********************************************\n");
	}
}
