
public class RoundRobin implements Scheduler{ //Scheduler��� �������̽��� �޾Ƽ� getNextCall, sendCallToAgent�޼ҵ带 ������ �����ؾ���.
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}
}
