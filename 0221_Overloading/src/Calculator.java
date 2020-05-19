
public class Calculator {
	private int a;
	private int b;
	
	public Calculator() {
		a=10;
		b=50;
	}
	
	public Calculator(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public Calculator(int b) {
		this.b=b;
	}
	
	public int f(int x) {
		return a*b+x;
	}


	public static void main(String[] args) {
		Calculator ex4 = new Calculator();
		Calculator ex5 = new Calculator(3,4);
		Calculator ex6 = new Calculator(4);
		
		System.out.println(ex4.f(3));
		System.out.println(ex5.f(3));
		System.out.println(ex6.f(3));
	}
}
