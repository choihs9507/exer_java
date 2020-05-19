
public class Student_ex {
	private static int serialNum = 1000; //static쓰면 모든 인스턴스가  SerialNum을 공유하므로 더하는거 다 인식함. static안쓰면 계속 인스턴스 별로 SerialNum쓰므로 1000도출
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardNum;
	
	public Student_ex() {
		serialNum++;
		studentID = serialNum;
		cardNum=serialNum+100;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}	
	
	public static void setSerialNum(int serialNum) {
		Student_ex.serialNum = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
}
