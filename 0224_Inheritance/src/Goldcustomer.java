
public class Goldcustomer extends Customer{
	
	double saleRatio;
	
	public Goldcustomer(String customerName) { //super�Ⱦ��� ����, ������ �ȿ� �����. �ٵ� �Ƚᵵ��.(�Ű����� �������)
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		saleRatio=0.1;
	}
		
	public int calcPrice(int price) { //�������̵�. �θ�Ŭ������ calcPrice�� �޸� ��������.(�Ű����� ���ƾ���)
		int price1 = price - (int)(saleRatio*price);
		bonusPoint = (int)(price1*bonusRatio);
		return price1;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + "���� ����� "+customerGrade+" �̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�.");
	}
}
