import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//input.txt�� ������ִ� ��

public class FileInputStreamTest {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")){//input.txt���� ��Ʈ�� ����
			int i;
			while((i=fis.read())!=-1) {//������ ���� �ƴ϶�� �� ����Ʈ �ݺ��ؼ� ����
				System.out.println((char)i);
			}
			System.out.println("end");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
