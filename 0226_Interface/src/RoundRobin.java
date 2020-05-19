
public class RoundRobin implements Scheduler{ //Scheduler라는 인터페이스를 받아서 getNextCall, sendCallToAgent메소드를 무조건 구현해야함.
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
