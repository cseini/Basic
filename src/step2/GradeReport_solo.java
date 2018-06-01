package step2;
import java.util.Scanner;
public class GradeReport_solo {
	/*public static boolean input(int param) {
		
	}*/
	public static String[] getTotal(String[] params) {
		String[] result = new String[10];
		result[0] = String.valueOf(
					Integer.parseInt(params[0])+
					Integer.parseInt(params[1])+Integer.parseInt(params[2]));
		result[1] = String.valueOf(Integer.parseInt(result[0])/3);
		return result;
	}
	public static String[] getGrade(String[] params) {
		String[] result = new String[10];
		result[0]=params[0];
		result[1]=params[1];
		switch(Integer.parseInt(params[1])/10) {
		case 9: case 10: result[2] = "A";break;
		case 8: result[2] = "B";break;
		case 7: result[2] = "C";break;
		case 6: result[2] = "D";break;
		case 5: result[2] = "E";break;
		default : result[2] = "F";break;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 :");
		String name = scan.next();
		String[] subjects = {"국어","영어","수학"};
		String[] params = new String[10];
		for(int i =0;i<subjects.length;i++) {
			System.out.println(subjects[i]+"점수를 입력하세요.");
			params[i] = scan.next();
		}
		String[] arr = getGrade(getTotal(params));
		System.out.printf("  이름  |  총점  |  평균  | 학점 |\n");
		System.out.printf("   %s   |   %s   |   %s   |  %s  |",name, arr[0],arr[1],arr[2]);
	}
}
