
public class AnonymousInnerTest {
	
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		
		Runnable runner = out.getRunnable(40); //메소드 호출
		runner.run(); //40, 100출력
		out.runner.run(); //runnable이 구현된 익명 클래스 변수 출력
	}
}
