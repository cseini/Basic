package step1;
import java.util.Scanner;
/**
대한비만학회는 기존에는 BMI가 18.5 미만이면 저체중, 18.5∼23은 정상, 23~25이면 과체중,
25∼30은 경도비만, 30∼35는 중등도비만 , 35 이상이면 고도비만으로 구분했었으나,
2018년 비만진료지침에서 단계별 용어가 새롭게 변경되어 18.5 미만이면 저체중, 18.5∼23은 정상, 
23~25이면 '비만 전단계'[5], 25∼30은 '1단계 비만', 30∼35는 '2단계 비만' , 35 이상이면 
'3단계 비만'으로 구분한다.
 * */
public class BMI {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1.실행 > ");
			switch(scan.nextInt()){
				case 0 :
					System.out.print("종료합니다.");
				return;
				case 1:
					System.out.print("실행합니다.");
					System.out.print("키(cm) > ");
					double height = scan.nextDouble();
					System.out.print("몸무게(kg) > ");
					double weight = scan.nextDouble();
					double bmi = (weight)/(height*height/10000);
					System.out.println("BMI지수 : "+bmi);
					String result = "";
					if(bmi<18.5){
						result = "저체중";
					} else if(18.5<=bmi&&bmi<23){
						result = "정상";
					} else if(23<=bmi&&bmi<25){
						result = "비만 전단계";
					} else if(25<=bmi&&bmi<30){
						result = "1단계 비만";
					} else if(30<=bmi&&bmi<35){
						result = "2단계 비만";
					} else{
						result = "3단계 비만";
					} 
					System.out.println(result);
				break;
				default : System.out.println("잘못입력하셨습니다.");break;
			}
		} 
	}
}