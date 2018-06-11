package step3;

import javax.swing.JOptionPane;

/**
 * 값을 두개 입력받아서 오칙연산(+,-,*,/,%)
 */
public class Calc {
	public static void main(String[] args) {
		String nextNum = "", result = "", opResult = "";
		String num = JOptionPane.showInputDialog("첫번째 숫자 : ");
		int value = Integer.parseInt(num);
		while (true) {
			String op = JOptionPane.showInputDialog("연산자 입력 : ");
			switch (op) {
			case "+":
				nextNum = JOptionPane.showInputDialog("다음 숫자 : ");
				result += op + nextNum;
				value += Integer.parseInt(nextNum);
				break;
			case "-":
				nextNum = JOptionPane.showInputDialog("다음 숫자 : ");
				result += op + nextNum;
				value -= Integer.parseInt(nextNum);
				break;
			case "*":
				nextNum = JOptionPane.showInputDialog("다음 숫자 : ");
				result += op + nextNum;
				value *= Integer.parseInt(nextNum);
				break;
			case "/":
				nextNum = JOptionPane.showInputDialog("다음 숫자 : ");
				result += op + nextNum;
				value /= Integer.parseInt(nextNum);
				break;
			case "%":
				nextNum = JOptionPane.showInputDialog("다음 숫자 : ");
				result += op + nextNum;
				value %= Integer.parseInt(nextNum);
				break;
			case "=":
				JOptionPane.showMessageDialog(null, num + result + op + value);
				return;
			}
		}
	}
}