
public class Taxi {
	int money;
	int passengerCount;
	String taxiNumber;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money){
		this.money += money;
		passengerCount ++;
	}
	
	public void showInfo() {
		System.out.println("�ý� "+taxiNumber+"�� �°��� "+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�.");
	}
}
