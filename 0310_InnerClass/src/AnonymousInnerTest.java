
public class AnonymousInnerTest {
	
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		
		Runnable runner = out.getRunnable(40); //�޼ҵ� ȣ��
		runner.run(); //40, 100���
		out.runner.run(); //runnable�� ������ �͸� Ŭ���� ���� ���
	}
}
