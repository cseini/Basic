package example;
import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int money=0,fhund=0, hund=0,ften=0,ten=0,modular=0; 
		System.out.println("## 교환할 돈은? ");
		money = s.nextInt();
		fhund=money/500;
		hund=(money%500)/100;
		ften=((money%500)%100)/50;
		ten=(((money%500)%100)%50)/10;
		modular=(((money%500)%100)%50)%10;
		System.out.println(fhund);
		System.out.println(hund);
		System.out.println(ften);
		System.out.println(ten);
		System.out.println(modular);
	}
}

