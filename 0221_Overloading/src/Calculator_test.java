
public class Calculator_test {
	public static void main(String[] args) {
		
		Calculator ex1 = new Calculator();
		Calculator ex2 = new Calculator(3,4);
		Calculator ex3 = new Calculator(4);
		
		System.out.println(ex1.f(2));
		System.out.println(ex2.f(2));
		System.out.println(ex3.f(2));
	}
}
