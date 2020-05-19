import java.util.Calendar;
import java.util.Date;

public class CalendatTest {
	public static void main(String[] args) {
		long millis=System.currentTimeMillis();//�и��� = 1/1000��
		//currentTimeMillis(); //1970.1.1���� ����ð� msec
		System.out.println(millis/1000/24/60/60); //��ĥ ���
		Date d= new Date();
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);
		System.out.println(dd);
		
		Calendar cal1995=Calendar.getInstance();
		//cal1995.set(1995,6,26); //0~11��
		cal1995.set(1995,Calendar.JULY,26); //0��~11��
		Calendar today=Calendar.getInstance();
		printCalendar(today);
		
		long minus=today.getTimeInMillis()-cal1995.getTimeInMillis();
		
		System.out.println(minus+" //1995.7.26 ~ ���� msec"); //19957.26 ~ ���� msec
		System.out.println(minus/1000/24/60/60+" //1995.7.26 ~ ���� ��"); //�и���/1000/24�ð�/60��/60��
	}
	
	//Į���� ����
	public static void printCalendar(Calendar c) {
		System.out.println("---------------------------------------");
		System.out.println(c.get(Calendar.YEAR)+"��"); //�� ��
		System.out.println(c.get(Calendar.MONTH)+1+"��"); //�� ��
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"��"); //�� ��
		System.out.println(c.get(Calendar.AM_PM)+"1�̸� PM, 0�̸� AM"); //1PM 0AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"��(24�ð�)"); //�� �� Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE)+"��"); //�� ��
		System.out.println(c.get(Calendar.SECOND)+"��"); //�� ��
	}
}
