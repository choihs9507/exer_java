package ifelse_switch;

public class switch_ex {
	public static void main(String[] args) {
		int floor = 3;
		
		
		switch(floor) {
		case 1 : System.out.println("약국입니다."); break;
		case 2 : System.out.println("정형외과입니다."); break;
		case 3 : System.out.println("피부과입니다."); break;
		case 4 : System.out.println("치과입니다."); break;
		case 5 : System.out.println("헬스 클럽입니다."); break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
	}
}

