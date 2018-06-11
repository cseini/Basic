package step3;

import javax.swing.JOptionPane;

public class MathRandom {
	public static void main(String[] args) {
		int min = Integer.parseInt(JOptionPane.showInputDialog("Random 값 중 첫번째 값 입력"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Random 값 중 마지막 값 입력"));
		int result = ((int) (Math.random() * max) + 1);
		while (true) {
			if (result >= min) {
				JOptionPane.showMessageDialog(null, result);
				return;
			} else {
				result = ((int) (Math.random() * max) + 1);
			}
		}
	}
}
