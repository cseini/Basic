package example;
import javax.swing.JOptionPane;

public class Example1 {
	public static void main(String[] args) {
		String[] price = new String[4];
		String[] menu = {"첫번","두번","세번","네번"};
		String result= "";
		int sum = 0;
		for(int i = 0; i<price.length;i++) {
			price[i]=JOptionPane.showInputDialog(menu[i]+"째 계산할 값을 입력하세요.");
			sum += Integer.parseInt(price[i]);
			result += (i!=3)? price[i]+"+":price[i]+"=" ;
		}
		JOptionPane.showMessageDialog(null, result+String.valueOf(sum));
	}
}
