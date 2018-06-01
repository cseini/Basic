package step2;

/**
 * [수열002] 1-2+3-4+5-6+.............-100 = -50 합계(스캐너없음)
 */
public class Seq011 {
	public static void main(String[] args) {
		String result = "";
		int evensum = 0, oddsum = 0;
		for (int i = 1; i <= 100; i++) {
			switch(i%2) {
			case 0:
				result=i+"+";
				if(i==100) result=i+"=";
				evensum+=i;
				break;
			case 1:
				result=i+"-";
				oddsum+=i;
				break;
			default:break;
			}
			System.out.print(result);
		}
		System.out.print(oddsum-evensum);
	}
}
