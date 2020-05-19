public class VIPcustomer extends Customer { //상속받을라면  extends 사용
//상속하면 위의 멤버변수 또 안써도 됨
	
	double saleRatio;
	
	public VIPcustomer(String customerName) {
		super(customerName); //super는 괄호 안에 부모 클래스 생성자의 매개변수가 들어가야 함.
		customerGrade="VIP"; //customer클래스 멤버변수 앞에 protected안하면 오류
		bonusRatio = 0.05;
		saleRatio=0.1;
	}
	
	public int calcPrice(int price) {
		
		int price1 = price - (int)(price*saleRatio);
		bonusPoint += price1*bonusRatio;
		return price1;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName +"님의 등급은 "+customerGrade+" 이며, 보너스 포인트는 "+bonusPoint+"입니다.");
	}
}
