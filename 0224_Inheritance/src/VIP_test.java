import java.util.*;


public class VIP_test {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("연초코");
		Customer customer11 = new Customer("김초코");
		Customer customer12 = new Customer("박초코");
		Customer customer2 = new VIPcustomer("연주은"); //맨 앞에 VIPcustomer안쓰고 부모 클래스 적어도 돌아감 (다형성)
		Goldcustomer customer3 = new Goldcustomer("이현석");
		Goldcustomer customer31 = new Goldcustomer("김현석");
		
		System.out.println(customer1.customerName + "님의 등급은 " + customer1.customerGrade + "이므로 지불해야 하는 금액은 " + customer1.calcPrice(10000) + "원 입니다.");
		System.out.println(customer11.customerName + "님의 등급은 " + customer11.customerGrade + "이므로 이 지불해야 하는 금액은 " + customer11.calcPrice(10000) + "원 입니다.");
		System.out.println(customer12.customerName + "님의 등급은 " + customer12.customerGrade + "이므로 이 지불해야 하는 금액은 " + customer12.calcPrice(10000) + "원 입니다.");
		System.out.println(customer2.customerName + "님의 등급은 " + customer2.customerGrade + "이므로 이 지불해야 하는 금액은 " + customer2.calcPrice(10000) + "원 입니다.");
		System.out.println(customer3.customerName + "님의 등급은 " + customer3.customerGrade + "이므로 이 지불해야 하는 금액은 " + customer3.calcPrice(10000) + "원 입니다.");
		System.out.println(customer31.customerName + "님의 등급은 " + customer31.customerGrade + "이므로 이 지불해야 하는 금액은 " + customer31.calcPrice(10000) + "원 입니다.");
		System.out.println("===================================================");
		customer1.showCustomerInfo();
		customer11.showCustomerInfo();
		customer12.showCustomerInfo();
		customer2.showCustomerInfo();
		customer3.showCustomerInfo();
		customer31.showCustomerInfo();
		
		System.out.println("===================================================");
		
		System.out.println("회원의 이름을 입력하시오");
		Scanner input1 = new Scanner(System.in);
		String name = input1.next();
		
		System.out.println("회원의 등급을 입력하시오");
		String grade = input1.next();
		
		System.out.println("구매하려는 물품의 가격을 입력하시오");
		int price = input1.nextInt();
		input1.close();
		
		if (grade.equalsIgnoreCase("SILVER")) { 
			Customer custom1 = new Customer(name);
			System.out.println(custom1.customerName + "님의 등급은 " + grade +"이므로 지불해야 하는 금액은" + custom1.calcPrice(price)+"원 입니다.");
		}
		
		else if (grade.equalsIgnoreCase("VIP")){
			VIPcustomer custom2 = new VIPcustomer(name);
			System.out.println(custom2.customerName + "님의 등급은 " + grade +"이므로 지불해야 하는 금액은" + custom2.calcPrice(price)+"원 입니다.");
		}
		else if (grade.equalsIgnoreCase("GOLD")){
			Goldcustomer custom3 = new Goldcustomer(name);
			System.out.println(custom3.customerName + "님의 등급은 " + grade +"이므로 지불해야 하는 금액은" + custom3.calcPrice(price)+"원 입니다.");
		}
		
		else {System.out.println("잘못 입력했습니다.");}
		
		
	}
}