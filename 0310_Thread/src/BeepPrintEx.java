import java.awt.Toolkit;

public class BeepPrintEx {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); //�Ҹ����� �ϴ� �Լ�
			try {Thread.sleep(500);} catch(Exception e) {} //Thread.sleep(500) 500��ŭ ��
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//���� ������� �Ҹ��� ���̶� ���� ǥ�� �ȵ�