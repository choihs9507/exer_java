
public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask(); //BeepTask�� Runnable�� implements�ؾ���
		//Runnable��ü �����
		Thread thread = new Thread(beepTask); //beepTask������ ���� ��üȭ
		thread.start(); //����
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//Runnable�� ��Ƽ �������� �����.