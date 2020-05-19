package ifelse_switch;

public class Operator_ex_if {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		int ans;
		char operator = '+';

		if (operator == '+') ans=num1+num2;
		else if (operator == '-') ans=num1-num2;
		else if (operator == '*') ans=num1*num2;
		else ans=num1/num2;
		
		System.out.println("¥‰¿∫"+ans);
	}
}
