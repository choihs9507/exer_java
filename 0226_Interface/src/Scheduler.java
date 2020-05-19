
public interface Scheduler { //인터페이스는 추상화와 달리 강제성이 있음 implements하는 클래스는 무조건 구현해줘야함
	public void getNextCall();
	public void sendCallToAgent();
}
