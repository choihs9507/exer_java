
public abstract class Car { //추상클래스
	
	public abstract void run(); //추상메서드, 하위클래스에서 재정의
	public abstract void refuel(); //추상메서드, 하위클래스에서 재정의
	
	public void stop() { //하위클래스에서 재정의 안해도 됨.
		System.out.println("차가 멈춥니다.");
	}
	/////////////////////////////////////////////////////////////
	public abstract void drive();
	public abstract void stop1();
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run1() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
