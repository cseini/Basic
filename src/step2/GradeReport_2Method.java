package step2;
import java.util.Scanner;
public class GradeReport_2Method {
	public static boolean input(int param) {
		return (param>=0 && param<=100);
	}
	public static int getSum(String[] params) {
		return Integer.parseInt(params[1]) +Integer.parseInt(params[2]) + Integer.parseInt(params[3]);
	}
	public static int getAverage(int getSum) {
		return getSum/3;
	}
	public static String getGrade(int getAverage) {
		String result = "";
		switch(getAverage/10){
			case 9:case 10: result = "A"; break;
			case 8: result = "B"; break;
			case 7: result = "C"; break;
			case 6: result = "D"; break;
			case 5: result = "E"; break;
			default :result = "F"; break;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] params = new String[10];
		String[] output = {"이름", "국어", "영어", "수학"};
		System.out.println("이름을 입력해주세요.");
		params[0] = scan.next();
		for(int i=1; i<output.length;i++) {
			System.out.println(output[i]+"점수를 입력해주세요.");
			int temp = scan.nextInt();
			if(input(temp)) {
				params[i] = String.valueOf(temp);
			} else {
				i--;
			}
		}
		int sum = getSum(params);
		int avr = getAverage(getSum(params));
		String grade = getGrade(getAverage(getSum(params))), name = params[0];
		System.out.printf("*********************************************\n");
		System.out.printf("|   이름   |   총점   |   평균   |   등급   |\n");
		System.out.printf("---------------------------------------------\n");
		System.out.printf("|  %s  |   %d    |    %d   |    %s     |\n",name, sum, avr, grade);
		System.out.printf("*********************************************\n");
	}
}
