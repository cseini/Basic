package step1;
import java.util.Scanner;
public class RPSGame {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료 1.실행 > ");
			switch(scan.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
			System.out.println("가위=1, 바위=2, 보=3 > ");
			System.out.print("Enter User A : ");
			int usera = scan.nextInt();
			System.out.print("Enter User B : ");
			int userb = scan.nextInt();
			if((1<=usera&&usera<=3)&&(1<=userb&&userb<=3)) {
				int a_b = usera-userb;
				String result = (a_b==0) ? "비김" : "A가 이김";
				if(a_b==-1||a_b==2) result = "B가 이김";
				System.out.println(result);
				System.out.println();
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
			break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}