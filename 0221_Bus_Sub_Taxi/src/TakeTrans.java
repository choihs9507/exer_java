
public class TakeTrans {
	public static void main(String[] args) {
		Student studentChris = new Student("Chris", 5000);
		Student studentEmily = new Student("Emily", 10000);
		Student studentDavid = new Student("David", 12000);
		
		Bus bus5623 = new Bus(5623);
		studentChris.takeBus(bus5623);
		studentChris.showInfo();
		bus5623.showInfo();
		System.out.println("");
		
		Subway subwayGreen = new Subway("2È£¼±");
		studentEmily.takeSubway(subwayGreen);
		studentEmily.showInfo();
		subwayGreen.showInfo();
		System.out.println("");
		
		Taxi taxi123 = new Taxi("123È£");
		studentDavid.takeTaxi(taxi123);
		studentDavid.showInfo();
		taxi123.showInfo();
	}

}
