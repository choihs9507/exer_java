import java.util.*;


public class VIP_test {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("������");
		Customer customer11 = new Customer("������");
		Customer customer12 = new Customer("������");
		Customer customer2 = new VIPcustomer("������"); //�� �տ� VIPcustomer�Ⱦ��� �θ� Ŭ���� ��� ���ư� (������)
		Goldcustomer customer3 = new Goldcustomer("������");
		Goldcustomer customer31 = new Goldcustomer("������");
		
		System.out.println(customer1.customerName + "���� ����� " + customer1.customerGrade + "�̹Ƿ� �����ؾ� �ϴ� �ݾ��� " + customer1.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println(customer11.customerName + "���� ����� " + customer11.customerGrade + "�̹Ƿ� �� �����ؾ� �ϴ� �ݾ��� " + customer11.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println(customer12.customerName + "���� ����� " + customer12.customerGrade + "�̹Ƿ� �� �����ؾ� �ϴ� �ݾ��� " + customer12.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println(customer2.customerName + "���� ����� " + customer2.customerGrade + "�̹Ƿ� �� �����ؾ� �ϴ� �ݾ��� " + customer2.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println(customer3.customerName + "���� ����� " + customer3.customerGrade + "�̹Ƿ� �� �����ؾ� �ϴ� �ݾ��� " + customer3.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println(customer31.customerName + "���� ����� " + customer31.customerGrade + "�̹Ƿ� �� �����ؾ� �ϴ� �ݾ��� " + customer31.calcPrice(10000) + "�� �Դϴ�.");
		System.out.println("===================================================");
		customer1.showCustomerInfo();
		customer11.showCustomerInfo();
		customer12.showCustomerInfo();
		customer2.showCustomerInfo();
		customer3.showCustomerInfo();
		customer31.showCustomerInfo();
		
		System.out.println("===================================================");
		
		System.out.println("ȸ���� �̸��� �Է��Ͻÿ�");
		Scanner input1 = new Scanner(System.in);
		String name = input1.next();
		
		System.out.println("ȸ���� ����� �Է��Ͻÿ�");
		String grade = input1.next();
		
		System.out.println("�����Ϸ��� ��ǰ�� ������ �Է��Ͻÿ�");
		int price = input1.nextInt();
		input1.close();
		
		if (grade.equalsIgnoreCase("SILVER")) { 
			Customer custom1 = new Customer(name);
			System.out.println(custom1.customerName + "���� ����� " + grade +"�̹Ƿ� �����ؾ� �ϴ� �ݾ���" + custom1.calcPrice(price)+"�� �Դϴ�.");
		}
		
		else if (grade.equalsIgnoreCase("VIP")){
			VIPcustomer custom2 = new VIPcustomer(name);
			System.out.println(custom2.customerName + "���� ����� " + grade +"�̹Ƿ� �����ؾ� �ϴ� �ݾ���" + custom2.calcPrice(price)+"�� �Դϴ�.");
		}
		else if (grade.equalsIgnoreCase("GOLD")){
			Goldcustomer custom3 = new Goldcustomer(name);
			System.out.println(custom3.customerName + "���� ����� " + grade +"�̹Ƿ� �����ؾ� �ϴ� �ݾ���" + custom3.calcPrice(price)+"�� �Դϴ�.");
		}
		
		else {System.out.println("�߸� �Է��߽��ϴ�.");}
		
		
	}
}