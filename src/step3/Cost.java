package step3;
import javax.swing.JOptionPane;

public class Cost {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름");
		String result = "";
		int giveCost = Integer.parseInt(JOptionPane.showInputDialog("출장비 지급액"));
		int giveCost1 = giveCost;
		int m = 0;
		int[] billCost = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[][] billCount = new int[10][10];
		while(true) {
			if(name.equals("quit")) {
				
			}
			for(int i = 0; i < billCost.length; i++) {
				m = giveCost/billCost[i];
				giveCost -= billCost[i]*m;
				billCount[i][i] = m;
				JOptionPane.showMessageDialog(null, "출장비 지급표\n"
						+ "|  성명  |출장비지급액|  오만  |  일만  |  오천  |  일천  |  오백  |  일백  |  오십  |  일십  |   오   |   일   |\n"
						+ "|"+name + "|         "+giveCost1 +"        |  "+ result);
			}
		}
		
	}
}