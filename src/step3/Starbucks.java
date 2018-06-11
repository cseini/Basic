package step3;
import javax.swing.JOptionPane;

public class Starbucks {
	public static int getItemPrice(int many, int orderNum) {
		int[] prices = { 3000, 3500, 4000 };
		return many * prices[orderNum - 1];
	}
	public static void main(String[] args) {
		int totalPrice = 0;
		while (true) {
			int orderNum = Integer.parseInt(JOptionPane.showInputDialog(
					"메뉴를 골라주세요.\n" + "0. 계산\n" + "1. 아메리카노 3000\n" + "2. 라떼 3500\n" + "3. 카푸치노4000\n"));
			switch (orderNum) {
			case 0:
				JOptionPane.showMessageDialog(null, "결재 금액 : " + totalPrice);
				return;
			case 1:
			case 2:
			case 3:
				totalPrice += getItemPrice(Integer.parseInt(JOptionPane.showInputDialog("몇잔?")), orderNum);
				break;
			default:
				JOptionPane.showMessageDialog(null, "잘못 주문하셨습니다.\n");
				break;
			}
		}
	}
}
