
public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player(); //�ʱ� �÷��̾�� ���� ������.
		player.play(1); //���� 1�� ����
		System.out.println("");
		
		AdvancedLevel aLevel = new AdvancedLevel(); //�߱����� ���׷��̵�� aLevel��ü ����
		SuperLevel sLevel = new SuperLevel(); //���۷� ���׷��̵�� sLevel��ü ����
		
		player.upgradeLevel(aLevel); //����Ŭ������ ���׷��̸޼ҵ忡 ���׷��̵�� �޽��� ����
		player.play(2);
		System.out.println("");	

		player.upgradeLevel(sLevel); //����Ŭ������ ���׷��̸޼ҵ忡 ���׷��̵�� �޽��� ����
		player.play(4);
		System.out.println("");	
	}
}