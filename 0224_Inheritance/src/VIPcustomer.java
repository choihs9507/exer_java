public class VIPcustomer extends Customer { //��ӹ������  extends ���
//����ϸ� ���� ������� �� �Ƚᵵ ��
	
	double saleRatio;
	
	public VIPcustomer(String customerName) {
		super(customerName); //super�� ��ȣ �ȿ� �θ� Ŭ���� �������� �Ű������� ���� ��.
		customerGrade="VIP"; //customerŬ���� ������� �տ� protected���ϸ� ����
		bonusRatio = 0.05;
		saleRatio=0.1;
	}
	
	public int calcPrice(int price) {
		
		int price1 = price - (int)(price*saleRatio);
		bonusPoint += price1*bonusRatio;
		return price1;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName +"���� ����� "+customerGrade+" �̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�.");
	}
}
