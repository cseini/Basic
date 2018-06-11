package step5;
import javax.swing.JOptionPane;
enum Butt{
		EXIT,
		INPUT,
		LIST;
}
public class Salary {
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.INPUT,
				Butt.LIST
			};
		String[][] mtx = new String[5][5];
		while(true) {
			Butt select=(Butt)JOptionPane.showInputDialog(
					null,
					"부서별 합계",
					"기능을 선택하세요",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					buttons[1]
					);
			switch(select) {
			case EXIT: 
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case INPUT:
				/*for(int i =0; i<3;i++) {
					for(int j = 0; j<1;j++) {
					String dept = JOptionPane.showInputDialog("부서");
					mtx[i][j]=dept;
					String name = JOptionPane.showInputDialog("이름");
					mtx[i][j+1]=name;
					String sal = JOptionPane.showInputDialog("본봉");
					mtx[i][j+2]=sal;
					String bonus = JOptionPane.showInputDialog("수당");
					mtx[i][j+3]=bonus;
					}
				}*/
				String[] menu = {"부서", "이름", "본봉", "수당"};
				for(int i=0; i<3;i++) {
					for(int j=0;j<4;j++) {
					String temp = JOptionPane.showInputDialog(menu[j]);
					mtx[i][j]=temp;
					}
					mtx[i][4]=String.valueOf((Integer.parseInt(mtx[i][2]))+(Integer.parseInt(mtx[i][3])));
				}
				break;
			case LIST: 
				String result = "  부서  |  이름  |  본봉  |  수당  |  합계   \n";
				/*for(int i=0;i<3;i++) {
					for(int j=0;j<1;j++) {
						mtx[i][j+4] = String.valueOf(Integer.parseInt(mtx[i][j+2]) + Integer.parseInt(mtx[i][j+3]));
					}
				}*/
				for(int i=0;i<3;i++) {
					for(int j=0;j<5;j++) {
						result += mtx[i][j]+"   |   ";
					}
					result += "\n";
				}
				JOptionPane.showMessageDialog(null,	result);
				break;
			default: break;
			}
		}
		
	}
}
