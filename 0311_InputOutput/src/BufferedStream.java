import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class BufferedStream {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			millisecond = System.currentTimeMillis(); //돌리기 전 현재 시간
			int i;
			while((i=bis.read())!=-1) { //바이트로 처음부터 복사함. 근데  보조스트림 써서 한꺼번에 가능
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond; //돌리고 난 후 시간에서 돌리기 전 시간 뻄
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 하는데  " + millisecond + "milliseconds 소요되었습니다.");
	}
} //a.zip을 copy.zip으로 복사해주는 클래스
