
public class Student {
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) { //Source -> Generate getters and setters·Î ¸¸µë
		this.studentName = studentName;
	}


	public Student() {
		serialNum ++;
		studentID = serialNum;
	}
}
