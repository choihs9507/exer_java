package algorithm;

public class Hanoi {
	private static int tray=3; //접시 수
	private int bar=3; //막대 수 는 변경 불가능
	static int count=0;
	int[][] rings;
	
	public Hanoi(int tray) {
		this.tray=tray; //접시 수 변경
		rings=new int[tray][bar];
	}
	public static void moveHanoi(int tray, char a, char b, char c) {
		if(tray==1) { //접시가 1일 땐,
			print(tray,a,c); //접시가 하나일땐, a에서 c로 한번만 옮김
			count++;
		}
		else {
			moveHanoi(tray-1,a,c,b); //1이 아니면 맨 밑에 있는게 없다 치고 먼저 다 b로 옮김
			print(tray,a,c); //a의 맨 밑에 있던 걸 c로 옮김
			count++;
			moveHanoi(tray-1,b,a,c); //그다음 다시 b에 있던 것들을 c로 옮김
		}
		
	}
	
	public static void print(int tray, char start, char end) {
			System.out.println(start+" bar쪽에 있던 링이 "+end+" bar쪽으로 이동");
	}

}
