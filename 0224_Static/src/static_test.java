
public class static_test {
	
	public static void main(String[] args) {
		Student studentYeon = new Student();
		studentYeon.setStudentName("���ֹ�");
		System.out.println(Student.serialNum); //�ʱⰪ ��� StudentŬ������  serialNum�տ� static ������ �ν� ����
		System.out.println(studentYeon.studentName+"�й� : "+studentYeon.studentID);
	
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(Student.serialNum); //�ʱⰪ ���
		System.out.println(studentLee.studentName+"�й� : "+studentLee.studentID);
	}
	
}
