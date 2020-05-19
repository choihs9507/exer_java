
public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcat concat2 = (s,v) -> System.out.println(s+" "+v); 
		//StringConcat인터페이스로 객체만듬, 이때, 람다형식으로 정의
		concat2.makeString(s1, s2);
		//객체에 makeString메서드 적용
	}
}
