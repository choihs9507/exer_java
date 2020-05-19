import java.awt.Toolkit;

public class BeepTask implements Runnable{ //implements(추상) Runnable에 run메서드는 body가 없는 추상메서드임
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//Runnable로 멀티 스레드 할 경우