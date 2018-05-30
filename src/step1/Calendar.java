package step1;
import java.util.Scanner;
/**
  월을 입력해서 해당 월의 마지막 날을
       알려주는 로직.
       예를 들면, 3월이면 말일이 3월31일입니다.
       9월이면 말일이 9월30일입니다.라고 알려줌.
       단 2월은 2월28일을 말일로 해서 2월28일입니다.
    라고 함.
 */
public class Calendar {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 > ");
				switch(scan.nextInt()){
					case 0 :
					System.out.println("종료합니다.");
					return;
					case 1 :
					System.out.println("실행합니다.");
					System.out.print("원하시는 월을 입력해주세요. >");
					int month = scan.nextInt();
					String result = "";
					int lastday = 0;
					switch(month){
						case 2: lastday = 28; break;
						case 4: case 6: case 9: case 11 : lastday =  30; break;
						default : lastday = 31; break;
					}
					System.out.println("말일이 "+month+"월 "+lastday+"입니다.");
					break;
					default: System.out.println("잘못입력하셨습니다."); break;
			}
		}
	}
}