
public class Student_ex_test {
	public static void main(String[] args) {
		Student_ex student1 = new Student_ex();
		student1.setStudentName("��OO");
		student1.getStudentName();
		System.out.println(student1.studentName+"�� �й��� "+ student1.getSerialNum() +"�̰� �л� ī���ȣ�� "+student1.cardNum); 
		//Student_exŬ������ serialNum������� �տ� private�� �ν� ����. �׷���  get�Լ� ���� get�� �����
		
		Student_ex student2 = new Student_ex();
		student2.setStudentName("��OO");
		System.out.println(student2.studentName+"�� �й��� "+ student1.getSerialNum() +"�̰� �л� ī���ȣ�� "+student2.cardNum);
		
		
		Student_ex student3 = new Student_ex();
		System.out.println(student3.studentName+"�� �й��� "+ student3.getSerialNum() +"�̰� �л� ī���ȣ�� "+student3.cardNum);
	}
}
