
public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {	//생성자
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money = this.money-1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money = this.money-1500;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money=this.money-10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 "+money+"원 입니다.");
	}
}
