
public class AdvancedLevel extends PlayerLevel{
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump() {
		System.out.println("1칸 jump합니다.");
	}
	public void turn() {
		System.out.println("기능을 요청할 수 없습니다.");
	}
	public void showLevelMessage() {
		System.out.println("******중급 레벨입니다*****");
	}
}
