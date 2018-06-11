package step3;

import javax.swing.JOptionPane;

public class ArrayTest2 {
	public static String[] getTotal(String[] scores) {
		String[] result = new String[3];
		result[0] = String
				.valueOf(Integer.parseInt(scores[1]) + Integer.parseInt(scores[2]) + Integer.parseInt(scores[3]));
		result[1] = String.valueOf(Integer.parseInt(result[0]) / 3);
		switch (Integer.parseInt(result[1]) / 10) {
		case 10:
		case 9:
			result[2] = "A";
			break;
		case 8:
			result[2] = "B";
			break;
		case 7:
			result[2] = "C";
			break;
		case 6:
			result[2] = "D";
			break;
		case 5:
			result[2] = "E";
			break;
		default:
			result[2] = "F";
			break;
		}
		return result;
	}

	public static void printTotal(String[] information) {
		String[] result = information;
		String totalResult = "";
		for (int i = 0; i < result.length; i++) {
			totalResult += result[i] + "\n";
		}

		JOptionPane.showMessageDialog(null, "   이름  | 국어 | 영어 | 수학 | 총점 | 평균 | 학점 \n" + totalResult);
	}

	public static void ranking(String[] information) {
  		String[] ranking = new String[3];
  		String[] temp = information[0].split("\\|"); 
		int a = Integer.parseInt(temp[4]);
		temp = information[1].split("\\|"); 
		int b = Integer.parseInt(temp[4]);
		temp = information[2].split("\\|"); 
		int c = Integer.parseInt(temp[4]);
		if(a>c&&a>c) {
			ranking[0] = "1 |"+ information[0];
			if(b>c) {
				ranking[1] = "2 |" + information[1];
				ranking[2] = "3 |" + information[2];
			} else {
				ranking[1] = "2 |" + information[2];
				ranking[2] = "3 |" + information[1];
			}
		} else if(b>c) {
			ranking[0] = "1 |" + information[1];
			if(a>c) {
				ranking[1] = "2 |" + information[0];
				ranking[2] = "3 |" + information[2];
			} else {
				ranking[1] = "2 |" + information[2];
				ranking[2] = "3 |" + information[0];
			}
		} else {
			ranking[0] = "1 |" + information[2];
			if(a>b){
				ranking[1] = "2 |" + information[0];
				ranking[2] = "3 |" + information[1];
			} else {
				ranking[1] = "2 |" + information[1];
				ranking[2] = "3 |" + information[0];
			}
		}
		String rankResult = ranking[0] +"\n"+ ranking[1]+"\n"+ranking[2];
			JOptionPane.showMessageDialog(null,	"  순위 | 이름  | 국어 | 영어 | 수학 | 총점 | 평균 | 학점 \n"+ rankResult);
	}

	public static void main(String[] args) {
		int count = 0;
		String[] totalResult = new String[3];
		while (true) {
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위출력 ");
			switch (menu) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				String score = JOptionPane.showInputDialog("이름/국어/영어/수학 입력");
				String[][] scores1 = new String[4][3];
				String[] scores = score.split("/");
				for(int i =0;i<scores1[0].length;i++) {
					scores1[count++][i] = scores[i];
				}
				String[] total = getTotal(scores);
				String result = "";
				for (int i = 0; i < scores.length; i++) {
					result += scores[i] + "|";
				}
				for (int i = 0; i < total.length; i++) {
					result += total[i] + "|";
				}
				JOptionPane.showMessageDialog(null, "   이름  | 국어 | 영어 | 수학 | 총점 | 평균 | 학점 \n" + result);
				totalResult[count++] = result;
				break;
			case "2":
				printTotal(totalResult);
				break;
			case "3":
				ranking(totalResult);
				break;
			default:
				break;

			}
		}
	}
}
