package hanois;

public class HanoisMain {
	public static void main(String[] args) {
		int tray=4; //���� 4�� �غ�
		Hanoi ha = new Hanoi(tray); //���� 4�忡 ���� �迭 ����
		int[][] a = ha.getRings();
		HanoiUtil.showHanoi(a); //���� 4�忡 ���� �迭 ���
		HanoiUtil.moveHanoi(a,tray,'a','b','c'); //���� �̵� ������ �迭�� ����Ѵ�.
	}
}
