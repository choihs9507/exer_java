
public class Student {
	
	int studentID;
	private String studentName; //멤버변수 설정
	int grade;
	String address;
	
	public String getStudentName() { //이름뽑는 메소드 만듬
		return studentName;
	}
	
	public void setStudentName(String studentName1) { //studentName을 
		this.studentName = studentName1;
	}
}
