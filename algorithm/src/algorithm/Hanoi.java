package algorithm;

public class Hanoi {
	private static int tray=3; //���� ��
	private int bar=3; //���� �� �� ���� �Ұ���
	static int count=0;
	int[][] rings;
	
	public Hanoi(int tray) {
		this.tray=tray; //���� �� ����
		rings=new int[tray][bar];
	}
	public static void moveHanoi(int tray, char a, char b, char c) {
		if(tray==1) { //���ð� 1�� ��,
			print(tray,a,c); //���ð� �ϳ��϶�, a���� c�� �ѹ��� �ű�
			count++;
		}
		else {
			moveHanoi(tray-1,a,c,b); //1�� �ƴϸ� �� �ؿ� �ִ°� ���� ġ�� ���� �� b�� �ű�
			print(tray,a,c); //a�� �� �ؿ� �ִ� �� c�� �ű�
			count++;
			moveHanoi(tray-1,b,a,c); //�״��� �ٽ� b�� �ִ� �͵��� c�� �ű�
		}
		
	}
	
	public static void print(int tray, char start, char end) {
			System.out.println(start+" bar�ʿ� �ִ� ���� "+end+" bar������ �̵�");
	}

}
