
public class Student_ex {
	private static int serialNum = 1000; //static���� ��� �ν��Ͻ���  SerialNum�� �����ϹǷ� ���ϴ°� �� �ν���. static�Ⱦ��� ��� �ν��Ͻ� ���� SerialNum���Ƿ� 1000����
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
