import java.io.FileOutputStream;
import java.io.IOException;
//workplace�� output.txt�� �������ִ� ��

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65); //A�� �ƽ�Ű �ڵ�
			fos.write(66); //B�� �ƽ�Ű �ڵ�
			fos.write(67); //C�� �ƽ�Ű �ڵ�
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
