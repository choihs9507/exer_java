
public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean isValid;
/////////////////////////////////////////////////////////////get�Լ� : ��ȯ
	public int getYear() {
		return year; 
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
/////////////////////////////////////////////////////////////set���� : myDate�Լ��� ���ڵ��� this.�� �Ἥ ��������� set����
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
	public MyDate(int day, int month, int year) { //������ MyDate�޼ҵ� : �� �� ��, ������ ��������
		setYear(year);
		setMonth(month);
		setDay(day);
	}
//////////////////////////////////////////////////////////////////////////////boolean�� ���ڷ� �ϴ� 
	public boolean isValid() {
		boolean isValid = true;
		if (month<1 || month>12 || day<1 || day>31 || year<1) { isValid = false; System.out.println(getDay()+"�� "+getMonth()+"�� "+getYear()+"���� "+"��ȿ���� �ʽ��ϴ�"); }
		else if (month==2 & day>28) {isValid = false; System.out.println(getDay()+"�� "+getMonth()+"�� "+getYear()+"���� "+"��ȿ���� �ʽ��ϴ�");}
		else {
			System.out.println(getDay()+"�� "+getMonth()+"�� "+getYear()+"���� "+"��¥�� ��ȿ�մϴ�");
		}
		
		return isValid;
	}
}
