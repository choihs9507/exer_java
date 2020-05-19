import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RestDay {
	//토, 일요일인가?? 해당 월의 주말을 찾아내는 코드
	
	public static boolean isRest(Calendar tod) { //오늘(tod)가 휴일인가
		boolean isRest=false; //기본은 false
		if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||
				tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			//tod의 요일이 토요일이거나 일요일이면
			isRest=true; //휴일이다.
		}
		return isRest;
	}
	
	//Calendar를 문자열로
	public static String toYMD(Calendar dd) { //날짜형태를 문자열로 바꾸는 메소드
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //yyyy-mm-dd형태로
		//SimpleDateFormat이라는 클래스를 사용해서 인스턴스 만듬
		return sdf.format(dd.getTime()); //데이트 형식을 get해서 yyyy-mm-dd형태로 바까줌
		//날짜의 시간을 format형태로
	}
	
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance(); //오늘의 정보가 저장된 Calendar 생성
		int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH); //이달의 마지막 날을 구함
		for(int i=1;i<=lastDay;i++) {
			cal.set(Calendar.DAY_OF_MONTH,i); //1일부터 마지막날까지
			if(isRest(cal)) { //휴일(토, 일) 확인
				System.out.println(toYMD(cal)+"은 휴일입니다.");
			}
			
		}
	}
}
