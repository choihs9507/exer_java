
public class TakeCoffe {
	public static void main(String[] args) {
		
		Student studentVicky = new Student("Vicky", 31000);
		Student studentSpencer = new Student("Spencer", 10500);
		
		Starbucks star = new Starbucks("���ٹ�");
		studentVicky.takeStarbucks(star);
		studentVicky.showInfo();
		star.showInfo();
		System.out.println("");
		
		Coffebean bean = new Coffebean("Ŀ����");
		studentSpencer.takeCoffebean(bean);
		studentSpencer.showInfo();
		bean.showInfo();
		System.out.println("");
	}
}