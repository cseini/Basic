package step5;

public class Gugudan {
	public static void main(String[] args) {
		String[] result = new String[9];
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				result[i-2] = i+"X"+j+"="+i * j+" ";
				System.out.println(result[i-2]);
			}
		}
		System.out.println();
	}
}
