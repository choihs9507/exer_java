import java.awt.Toolkit;

public class BeepPrintEx {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); //¼Ò¸®³ª°Ô ÇÏ´Â ÇÔ¼ö
			try {Thread.sleep(500);} catch(Exception e) {} //Thread.sleep(500) 500¸¸Å­ ½°
		}
		
		for (int i=0;i<5;i++) {
			System.out.println("¶ò");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

//´ÜÀÏ ½º·¹µå¶ó ¼Ò¸®¶û ¶òÀÌ¶û °°ÀÌ Ç¥½Ã ¾ÈµÊ