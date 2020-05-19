
public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player(); //초기 플레이어는 비기너 레벨임.
		player.play(1); //비기너 1번 실행
		System.out.println("");
		
		AdvancedLevel aLevel = new AdvancedLevel(); //중급으로 업그레이드된 aLevel객체 생성
		SuperLevel sLevel = new SuperLevel(); //슈퍼로 업그레이드된 sLevel객체 생성
		
		player.upgradeLevel(aLevel); //상위클래스에 업그레이메소드에 업그레이드된 메시지 생성
		player.play(2);
		System.out.println("");	

		player.upgradeLevel(sLevel); //상위클래스에 업그레이메소드에 업그레이드된 메시지 생성
		player.play(4);
		System.out.println("");	
	}
}