
public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean isValid;
/////////////////////////////////////////////////////////////get함수 : 반환
	public int getYear() {
		return year; 
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
/////////////////////////////////////////////////////////////set힘수 : myDate함수의 인자들을 this.를 써서 멤버변수에 set해줌
	public void setYear(int yearr) {
		this.year = yearr;
	}
	public void setMonth(int monthh) {
		this.month = monthh;
	}
	public void setDay(int dayy) {
		this.day = dayy;
	}
//////////////////////////////////////////////////////////////////////////////
	public MyDate(int day, int month, int year) { //생성자 MyDate메소드 : 일 월 년, 넣으면 세팅해줌
		setYear(year);
		setMonth(month);
		setDay(day);
	}
//////////////////////////////////////////////////////////////////////////////boolean을 인자로 하는 
	public boolean isValid() {
		boolean isValid = true;
		if (month<1 || month>12 || day<1 || day>31 || year<1) { isValid = false; System.out.println(getDay()+"일 "+getMonth()+"월 "+getYear()+"년은 "+"유효하지 않습니다"); }
		else if (month==2 & day>28) {isValid = false; System.out.println(getDay()+"일 "+getMonth()+"월 "+getYear()+"년은 "+"유효하지 않습니다");}
		else {
			System.out.println(getDay()+"일 "+getMonth()+"월 "+getYear()+"년은 "+"날짜가 유효합니다");
		}
		
		return isValid;
	}
}
