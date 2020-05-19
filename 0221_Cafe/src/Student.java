
public class Student {
	public String studentName;
	public int grade;
	public int money;
	public String menu;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeStarbucks(Starbucks starbucks) {
		starbucks.take("americano");
		this.money = this.money - 6000;
	}
	public void takeCoffebean(Coffebean coffebean) {
		coffebean.take("caffelatte");
		this.money -= 4500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"´ÔÀÇ ³²Àº µ·Àº "+money+"¿ø ÀÔ´Ï´Ù.");
	}
	
}
