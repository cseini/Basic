package step1;
import java.util.Scanner;
public class RPSGame {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("가위=1, 바위=2, 보=3 (종료:99)");
			System.out.print("Enter User A : ");
			int usera = scan.nextInt();
			if(usera==99) break;
			System.out.print("Enter User B : ");
			int userb = scan.nextInt();
			int a_b = usera-userb;
			String result = (a_b==0) ? "비김" : "A가 이김";
			if(a_b==-1||a_b==2) result = "B가 이김";
			System.out.println(result);
			System.out.println();
		}
	}
}