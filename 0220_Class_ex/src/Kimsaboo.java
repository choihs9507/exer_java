
public class Kimsaboo {
	
	int age; //멤버변수 
	String name;
	boolean merry;
	int son;
	
	public static void main(String[] args) {
			
		Kimsaboo ex = new Kimsaboo(); //객체설정, 멤버변수를 메인함수에서 인식하기 위해서 (객체 설정 방법)
		ex.age = 50; //ex.객체 안쓰면 메인함수에서 인식 불가
		ex.name = "kimsaboo";
		ex.merry = true;
		ex.son = 4;
		
		System.out.println("이 사람의 나이 : "+ex.age);
		System.out.println("이 사람의 이름 : "+ex.name);
		System.out.println("이 사람의 결혼 여부 : "+ex.merry);
		System.out.println("이 사람의 자녀 수 : "+ex.son);
		
	}
}

