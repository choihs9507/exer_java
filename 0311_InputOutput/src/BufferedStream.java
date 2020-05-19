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
			millisecond = System.currentTimeMillis(); //������ �� ���� �ð�
			int i;
			while((i=bis.read())!=-1) { //����Ʈ�� ó������ ������. �ٵ�  ������Ʈ�� �Ἥ �Ѳ����� ����
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond; //������ �� �� �ð����� ������ �� �ð� �M
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ϴµ�  " + millisecond + "milliseconds �ҿ�Ǿ����ϴ�.");
	}
} //a.zip�� copy.zip���� �������ִ� Ŭ����
