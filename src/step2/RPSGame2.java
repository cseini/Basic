package step2;
import java.util.Scanner;
public class RPSGame2 {
	public static int[] input(Scanner scan) {
		int[] result = new int[2];
		System.out.println("가위=1, 바위=2, 보=3 > ");
		System.out.print("Enter User A : ");
		int usera = scan.nextInt();
		System.out.print("Enter User B : ");
		int userb = scan.nextInt();
		result[0] = usera;
		result[1] = userb;
		return result;
	}
	public static void game(int[] input) {
		if((1<=input[0]&&input[1]<=3)&&(1<=input[0]&&input[1]<=3)) {
		int a_b = input[0]-input[1];
		String result = (a_b==0) ? "비김" : "A가 이김";
		if(a_b==-1||a_b==2) result = "B가 이김";
		System.out.println(result);
		System.out.println();
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행 > ");
			switch(scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				game(input(scan));
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}