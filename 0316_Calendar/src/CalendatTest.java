import java.util.Calendar;
import java.util.Date;

public class CalendatTest {
	public static void main(String[] args) {
		long millis=System.currentTimeMillis();//밀리초 = 1/1000초
		//currentTimeMillis(); //1970.1.1부터 경과시간 msec
		System.out.println(millis/1000/24/60/60); //며칠 경과
		Date d= new Date();
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);
		System.out.println(dd);
		
		Calendar cal1995=Calendar.getInstance();
		//cal1995.set(1995,6,26); //0~11월
		cal1995.set(1995,Calendar.JULY,26); //0월~11월
		Calendar today=Calendar.getInstance();
		printCalendar(today);
		
		long minus=today.getTimeInMillis()-cal1995.getTimeInMillis();
		
		System.out.println(minus+" //1995.7.26 ~ 오늘 msec"); //19957.26 ~ 오늘 msec
		System.out.println(minus/1000/24/60/60+" //1995.7.26 ~ 오늘 일"); //밀리초/1000/24시간/60분/60초
	}
	
	//칼렌더 정보
	public static void printCalendar(Calendar c) {
		System.out.println("---------------------------------------");
		System.out.println(c.get(Calendar.YEAR)+"년"); //몇 년
		System.out.println(c.get(Calendar.MONTH)+1+"월"); //몇 월
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"일"); //몇 일
		System.out.println(c.get(Calendar.AM_PM)+"1이면 PM, 0이면 AM"); //1PM 0AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"시(24시간)"); //몇 시 Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE)+"분"); //몇 분
		System.out.println(c.get(Calendar.SECOND)+"초"); //몇 초
	}
}
