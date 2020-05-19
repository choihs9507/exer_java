
public class date_practice {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	public void setDay(int day) {
		this.day=day;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	public date_practice(int day, int month, int year) { //함수만들땐 클래스 이름으로. 리턴타입 생략
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public boolean isValid() {
		
		if(day<1 || day>31 || month<1 || month>31) {
			System.out.println(getYear()+"년 "+getMonth()+"월 "+getDay()+"일은 유효하지 않는 날짜입니다.");
			return false;
		}
		else if(month==2 && day>28) {
			System.out.println(getYear()+"년 "+getMonth()+"월 "+getDay()+"일은 유효하지 않는 날짜입니다.");
			return false;
		}
		else System.out.println(getYear()+"년 "+getMonth()+"월 "+getDay()+"일은 유효한 날짜입니다.");
		return true;
	}
}
