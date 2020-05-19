
public class DeskTop extends Computer{ //자식 클래스
	public void display() { //부모에서 추상메소드였으니 자식에서 구체적이게 
		System.out.println("DeskTop Display()");
	}
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
}
