
public class CarTest {
	
	public static void main(String[] args) {
		
		Bus bus = new Bus(); //객체로 만들려는 클래스는 abstract하면 오류남
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop(); //추상클래스는 인스턴스로 만들 수 없지만 하위클래스로 만든 인스턴스를 통해 메서드 사용가능
		autoCar.stop();
		System.out.println("====================");
		System.out.println("===자율주행 하는 자동차===");
		Car myCar = new AICar();
		myCar.run1();
		
		System.out.println("===사람이 운전하는 자동차===");
		Car hisCar = new ManualCar();
		hisCar.run1();
	}
}
