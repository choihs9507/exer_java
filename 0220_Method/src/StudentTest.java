
public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		//studentLee.studentName = "������"; //studentŬ��������  studentName��� ������ private�� ����, public�̸� ���ư�
		studentLee.setStudentName("������"); //
		System.out.println(studentLee.getStudentName());
	}
}
