package step2;

import java.util.Scanner;

public class GradeReport_solo {
	public static boolean input(int param) {
		return (param <= 0 && param <= 100);
	}

	public static String[] getTotal(String[] params) {
		String[] result = new String[10];
		result[0] = String
				.valueOf(Integer.parseInt(params[0]) + Integer.parseInt(params[1]) + Integer.parseInt(params[2]));
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);
		return result;
	}

	public static String[] getGrade(String[] params) {
		String[] result = new String[10];
		result[0] = params[0];
		result[1] = params[1];
		switch (Integer.parseInt(params[1]) / 10) {
		case 9:
		case 10:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
			break;
		default:
			result[2] = "F";
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String score = "점수";
		String[] subjects = {"이름", "국어"+score,"영어"+score,"수학"+score};
		String[] params = new String[10];
		String name = "";
		for(int i =0;i<subjects.length;i++) {
			System.out.println(subjects[i]+"를 입력하세요.");
			params[i] = scan.next();
			int temp = Integer.parseInt(params[i+1]);
			if(i!=0&&input(temp)) {
				params[i+1] = String.valueOf(temp);	
			} else {
				i--;
			}
		}
		String[] arr = getGrade(getTotal(params));
		System.out.printf("  이름  |  총점  |  평균  | 학점 |\n");
		System.out.printf("   %s   |   %s   |   %s   |  %s  |",name,arr[0],arr[1], arr[2]);
	}
}
