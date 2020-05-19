
public class Bus extends Car{ //하위클래스에서는 상위 추상클래스에서 위임한 메서드 모두 정의해야해
	
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void refuel() {
		System.out.println("천연가스를 충전합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	public void drive(){
		
	}
	public void stop1() {
		
	}

}
