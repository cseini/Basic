package example;

import javax.swing.JOptionPane;;

public class Example2 {
	public static void main(String[] args) {
		String[] calc = new String[3];
		String result = "";
		calc[0]=JOptionPane.showInputDialog("첫번째 계산할 값을 입력하세요.");
		calc[1]=JOptionPane.showInputDialog("연산자를 입력하세요. +, -, *, /");
		calc[2]=JOptionPane.showInputDialog("두번째 계산할 값을 입력하세요.");
		if (calc[1].equals("+")) {
			result = String.valueOf(Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]));
		} else if (calc[1].equals("-")) {
			result = String.valueOf(Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]));
		} else if(calc[1].equals("*")) {
			result = String.valueOf(Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]));
		} else {
			result = String.valueOf(Integer.parseInt(calc[0]) / Integer.parseInt(calc[2]));
		}
		JOptionPane.showMessageDialog(null, calc[0]+calc[1]+calc[2]+"="+result);
	}
}
