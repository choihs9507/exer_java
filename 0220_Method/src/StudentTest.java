
public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		//studentLee.studentName = "연초코"; //student클래스에서  studentName멤버 변수가 private면 오류, public이면 돌아감
		studentLee.setStudentName("연초코"); //
		System.out.println(studentLee.getStudentName());
	}
}
