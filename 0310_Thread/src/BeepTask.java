import java.awt.Toolkit;

public class BeepTask implements Runnable{ //implements(�߻�) Runnable�� run�޼���� body�� ���� �߻�޼�����
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//Runnable�� ��Ƽ ������ �� ���