package step3;
import javax.swing.JOptionPane;

public class RPSGame {
	public static int mathRandom() {
		int result = 0;
		int start = Integer.parseInt(JOptionPane.showInputDialog("첫번째 값 입력"));
		int stop = Integer.parseInt(JOptionPane.showInputDialog("마지막 값 입력"));
		result = ((int) (Math.random() * stop) + 1);
		while (true) {
			if (result >= start) {
				break;
			} else {
				result = ((int) (Math.random() * stop) + 1);
			}
		}
		return result;
	}
	public static String word(int rps) {
		String result = "";
		switch (rps) {
		case 1:
			result = "가위";
			break;
		case 2:
			result = "바위";
			break;
		case 3:
			result = "보";
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		int count = 0, win = 0;
		while (true) {
			String start = JOptionPane.showInputDialog("0.결과보기 1.게임하기");
			switch (start) {
			case "0":
				JOptionPane.showMessageDialog(null, count + "전 " + win + "승 ");
				return;
			case "1":
				int user = Integer.parseInt(JOptionPane.showInputDialog("가위=1, 바위=2, 보=3"));
				int computer = mathRandom();
				count++;
				int flag = user - computer;
				String result = (flag == 0) ? "비김" : "Computer가 이김";
				if (flag == 1 || flag == -2) {
					win++;
					result = "User가 이김";
				}
				String userWord = word(user);
				String comWord = word(computer);
				JOptionPane.showMessageDialog(null, "User :" + userWord + ", Computer " + comWord + "\n" + result);
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");
				break;
			}
		}
	}
}