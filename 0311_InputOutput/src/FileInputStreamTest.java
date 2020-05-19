import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//input.txt를 출력해주는 것

public class FileInputStreamTest {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")){//input.txt파일 스트림 생성
			int i;
			while((i=fis.read())!=-1) {//파일의 끝이 아니라면 한 바이트 반복해서 읽음
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
