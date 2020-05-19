
public class Student_ex_test {
	public static void main(String[] args) {
		Student_ex student1 = new Student_ex();
		student1.setStudentName("김OO");
		student1.getStudentName();
		System.out.println(student1.studentName+"의 학번은 "+ student1.getSerialNum() +"이고 학생 카드번호는 "+student1.cardNum); 
		//Student_ex클래스에 serialNum멤버변수 앞에 private면 인식 못함. 그래서  get함수 만들어서 get을 써야함
		
		Student_ex student2 = new Student_ex();
		student2.setStudentName("이OO");
		System.out.println(student2.studentName+"의 학번은 "+ student1.getSerialNum() +"이고 학생 카드번호는 "+student2.cardNum);
		
		
		Student_ex student3 = new Student_ex();
		System.out.println(student3.studentName+"의 학번은 "+ student3.getSerialNum() +"이고 학생 카드번호는 "+student3.cardNum);
	}
}
