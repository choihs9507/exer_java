
public abstract class Computer { //부모 추상 클래스
	public abstract void display(); //추상메소드 abstract안쓰면 body적으라고 오류
	public abstract void typing();  //추상메소드, 하위클래스에 너네가 만들라고 위임함 
	public void turnOn() {	//그냥 메소드
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() { //그냥 메소드
		System.out.println("전원을 끕니다.");
	}
}
