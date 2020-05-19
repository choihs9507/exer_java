
public class InnerTest {
	public static void main(String[] args) {
		
		//외부 클래스만 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("정적내부클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();
		
	}
}
