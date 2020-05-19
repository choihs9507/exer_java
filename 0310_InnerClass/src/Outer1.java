
public class Outer1 {
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			@Override
			public void run() {
//				num = 200;	//에러
//				i = 10;		//에러
				System.out.println(i);
				System.out.println(num);
			}
		};	//MyRunnable클래스 이름을 빼고 클래스 바로 생성
	}
	
	Runnable runner = new Runnable() { //익명 내부클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};	//인터페이스나 추상클래스형 변수를 선언하고 클래스를 생성해 대입하는 방법
}
