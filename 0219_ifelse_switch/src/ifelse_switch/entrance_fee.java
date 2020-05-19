package ifelse_switch;

public class entrance_fee {
	public static void main(String[] args) {
		int age=26;
		int fee;
		
		if (age < 8) fee = 1000;
		else if (age < 14) fee=2000;
		else if (age < 20) fee=2500;
		else if (age >=60) fee = 0;
		else fee=3000;
		
		System.out.println(fee);
	}
}
