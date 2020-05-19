
class OutClass {
	private int num = 10; //외부클래스의 인스턴스 변수
	private static int sNum = 20; //외부클래스의 스태틱 변수
	
	static class InStaticClass{ //정적내부클래스
		int inNum = 100;	//정적내부클래스의 인스턴스 변수
		static int sInNum = 200;  //정적내부클래스의 정적변수
		
		void inTest() {	//정적내부클래스의 일반 메서드
//			num += 10; //외부클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("InStaticClass inNum = "+inNum+"(내부클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = "+sNum+"(외부클래스의 스태틱 변수 사용)");
		}
		static void sTest() {	//정적내부클래스의  static메서드
//			num += 10;	//외부클래스의 인스턴스 변수는 사용할 수 없음
//			inNum += 10; //내부정적클래스의 인스턴스 변수는 사용할 수 없음
			System.out.println("OutClass sNum = "+sNum+"(외부클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(내부클래스의 스태틱 변수 사용)");
		}
	} //내부클래스에선  스태틱변수는 사용 가능 / 인스턴스 변수는 불가(정적내부클래스의 일반 메서드에선 내부클래스의 인스턴스 변수 가능)
}
