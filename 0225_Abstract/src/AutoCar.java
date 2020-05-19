
public class AutoCar extends Car { //하위클래스에서는 상위 추상클래스에서 위임한 메서드 모두 정의해야해
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	public void drive(){
		
	}
	public void stop1() {
		
	}


}
