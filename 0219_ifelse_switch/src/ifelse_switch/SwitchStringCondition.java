package ifelse_switch;

import java.util.Scanner;

public class SwitchStringCondition {
	public static double toMoney(String c) {
		double tot =0.0;
		switch(c) {
		case "USD": tot=1126.5; break;
		case "JPY": tot=110.6; break;
		case "CNY": tot=10.5; break;
		default: tot=1; break;
		}
		return tot;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���Ϸ��� ��ȭ�� ���ΰ���");
		int won = a.nextInt();
		
		
		System.out.println("USD, JPY, CNY�߿� �����ϼ���.");
		
		
		String money = a.next();
		String money1=money.toUpperCase();
		a.close();
		
		double result=toMoney(money1)*won;
		System.out.printf("%s => %f\n",money1,result);
	}
}
