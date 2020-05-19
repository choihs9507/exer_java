
public class Goldcustomer extends Customer{
	
	double saleRatio;
	
	public Goldcustomer(String customerName) { //super안쓰면 오류, 생성자 안에 써야함. 근데 안써도댐.(매개변수 맞춰야해)
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		saleRatio=0.1;
	}
		
	public int calcPrice(int price) { //오버라이딩. 부모클래스의 calcPrice와 달리 재정의함.(매개변수 같아야함)
		int price1 = price - (int)(saleRatio*price);
		bonusPoint = (int)(price1*bonusRatio);
		return price1;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + "님의 등급은 "+customerGrade+" 이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
}
