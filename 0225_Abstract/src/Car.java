
public abstract class Car { //�߻�Ŭ����
	
	public abstract void run(); //�߻�޼���, ����Ŭ�������� ������
	public abstract void refuel(); //�߻�޼���, ����Ŭ�������� ������
	
	public void stop() { //����Ŭ�������� ������ ���ص� ��.
		System.out.println("���� ����ϴ�.");
	}
	/////////////////////////////////////////////////////////////
	public abstract void drive();
	public abstract void stop1();
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run1() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
