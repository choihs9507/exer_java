package hanois;

public class HanoisMain {
	public static void main(String[] args) {
		int tray=4; //접시 4장 준비
		Hanoi ha = new Hanoi(tray); //접시 4장에 대한 배열 만듬
		int[][] a = ha.getRings();
		HanoiUtil.showHanoi(a); //접시 4장에 대한 배열 출력
		HanoiUtil.moveHanoi(a,tray,'a','b','c'); //접시 이동 과정을 배열로 출력한다.
	}
}
