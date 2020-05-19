
public class CalcTest {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 20;
		
		Calc calc = (s,v) -> {
			System.out.println(s+v);
			return s+v;
			};
		
		calc.add(num1, num2);
	}
}
