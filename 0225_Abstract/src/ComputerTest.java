
public class ComputerTest {
	
	public static void main(String[] args) {
		//Computer c1 = new Computer(); //추상클래스는 객체만들 때 오류 (추상클래스는 모든 메소드가 구현되지 않았기 때문에)
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
	}
}
