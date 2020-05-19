
public class Customer {
	protected int customerID; //��� �ٶ�� protected�� ����
	protected String customerName; //protected�� ����Ŭ�������� ��밡���ϰ� ����
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	int price;
	
	public Customer(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + "���� ����� "+customerGrade+"�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�.");
	}
}
