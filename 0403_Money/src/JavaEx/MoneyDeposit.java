package JavaEx;
import java.util.Scanner;

public class MoneyDeposit {
	//����
	public static double saveUs() {
		Scanner a1 = new Scanner(System.in);
		
		System.out.println("���� ���");
		double tot=0.0;
		System.out.println("������ �Է��ϼ���");
		double money1 = a1.nextDouble();
		System.out.println("��ġ ������ �Է��ϼ���");
		int month = a1.nextInt();
		System.out.println("�������� �Է��ϼ���");
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
		System.out.printf("���� : %.0f \n",tot);
	}
}
