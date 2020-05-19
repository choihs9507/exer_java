import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
			return ;
		}finally {
			if(fis != null) {
				try {
					fis.close(); //파일 입력 스트림 닫기
				}catch (IOException e) { //입출력시 지정한 파일이 존재하지 않을 때
					//TODO Auto-generated catch block
					e.printStackTrace(); //어디에서 예외 발생했는지 따라가는 메소드
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}
}
