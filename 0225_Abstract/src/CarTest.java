
public class CarTest {
	
	public static void main(String[] args) {
		
		Bus bus = new Bus(); //��ü�� ������� Ŭ������ abstract�ϸ� ������
		AutoCar autoCar = new AutoCar();
		
		bus.run();
		autoCar.run();
		
		bus.refuel();
		autoCar.refuel();
		
		bus.takePassenger();
		autoCar.load();
		
		bus.stop(); //�߻�Ŭ������ �ν��Ͻ��� ���� �� ������ ����Ŭ������ ���� �ν��Ͻ��� ���� �޼��� ��밡��
		autoCar.stop();
		System.out.println("====================");
		System.out.println("===�������� �ϴ� �ڵ���===");
		Car myCar = new AICar();
		myCar.run1();
		
		System.out.println("===����� �����ϴ� �ڵ���===");
		Car hisCar = new ManualCar();
		hisCar.run1();
	}
}
