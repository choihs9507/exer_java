
public class static_test {
	
	public static void main(String[] args) {
		Student studentYeon = new Student();
		studentYeon.setStudentName("연주미");
		System.out.println(Student.serialNum); //초기값 출력 Student클래스에  serialNum앞에 static 없으면 인식 못함
		System.out.println(studentYeon.studentName+"학번 : "+studentYeon.studentID);
	
		Student studentLee = new Student();
		studentLee.setStudentName("이지안");
		System.out.println(Student.serialNum); //초기값 출력
		System.out.println(studentLee.studentName+"학번 : "+studentLee.studentID);
	}
	
}
