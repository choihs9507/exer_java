
class BirthDay {
	int Day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample{
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		//위 두개가 같은 것. this
		//하나의 자바파일에 두개의 클래스 가능함. 근데 잘 안씀
	}
}
