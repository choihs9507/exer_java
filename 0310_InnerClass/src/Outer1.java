
public class Outer1 {
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			@Override
			public void run() {
//				num = 200;	//����
//				i = 10;		//����
				System.out.println(i);
				System.out.println(num);
			}
		};	//MyRunnableŬ���� �̸��� ���� Ŭ���� �ٷ� ����
	}
	
	Runnable runner = new Runnable() { //�͸� ����Ŭ������ ������ ����
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
	};	//�������̽��� �߻�Ŭ������ ������ �����ϰ� Ŭ������ ������ �����ϴ� ���
}
