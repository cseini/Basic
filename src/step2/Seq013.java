package step2;

/**
 * 항 사이의 증가하는 값이 일정한 비율로 증가하는 수열(스캐너 없음) 1+2+4+7+11+16+22+...순서로 나열되는 수열의 20번째
 * 항까지의 합계
 */
public class Seq013 {
	public static void main(String[] args) {
		int num = 0, num1 = 1, num2 = 1, sum = 0;
		String result = "";
		for (int i = 1; i <= 20; i++) {
			num1+=num;
			num++;
			if (i == 20) {
				result += num1 + "=";
			} else {
				result += num1 + "+";
			}
			sum += num1;
		}
		System.out.println(result + sum);
	}
}
