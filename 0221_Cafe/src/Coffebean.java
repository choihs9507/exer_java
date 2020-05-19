
public class Coffebean {
	int money;
	int passengerCount;
	String cafename;
	String americano;
	String coffelatte;
	
	public Coffebean(String cafename) {
		this.cafename = cafename;
	}
	
	public void take(String menu) {
		if(menu == "americano") {this.money += 6000; this.passengerCount ++;}
		else if(menu == "caffelatte") {this.money += 4500; this.passengerCount ++;}
//		else System.out.println("americano, caffelatte중에 선택해주세요.");
	}
	
	public void showInfo() {
		System.out.println(cafename+"의 손님은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");
	}
}
