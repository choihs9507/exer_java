import java.io.FileOutputStream;
import java.io.IOException;
//workplace에 output.txt로 저장해주는 것

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65); //A의 아스키 코드
			fos.write(66); //B의 아스키 코드
			fos.write(67); //C의 아스키 코드
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
