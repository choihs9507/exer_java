package JavaEx;
import java.util.Scanner;

public class MoneyDeposit {
	//적금
	public static double saveUs() {
		Scanner a1 = new Scanner(System.in);
		
		System.out.println("적금 계산");
		double tot=0.0;
		System.out.println("원금을 입력하세요");
		double money1 = a1.nextDouble();
		System.out.println("거치 개월을 입력하세요");
		int month = a1.nextInt();
		System.out.println("이자율을 입력하세요");
		double r = a1.nextDouble()/100/12;
		a1.close();
		
		for(int i=0;i<month;i++) {
			money1=money1*(1+r);
			tot+=money1;
		}
		return tot;
	}
	public static void main(String[] args) {
		double tot=MoneyDeposit.saveUs();
		System.out.printf("적금 : %.0f \n",tot);
	}
}
