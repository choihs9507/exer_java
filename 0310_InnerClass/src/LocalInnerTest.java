
public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(); //Ŭ���� ����
		Runnable runner = out.getRunnable(40); //�޼ҵ� ȣ��
		runner.run();
	}
}
