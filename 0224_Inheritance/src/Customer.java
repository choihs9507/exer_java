
public class Customer {
	protected int customerID; //상속 줄라면 protected로 ㄱㄱ
	protected String customerName; //protected는 하위클래스에서 사용가능하게 해줌
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
		System.out.println(customerName + "님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
}
