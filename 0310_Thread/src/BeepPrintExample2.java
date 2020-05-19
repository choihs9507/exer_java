
public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask(); //BeepTask가 Runnable을 implements해야함
		//Runnable객체 만들고
		Thread thread = new Thread(beepTask); //beepTask스레드 만들어서 객체화
		thread.start(); //실행
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//Runnable로 멀티 스레드할 경우임.