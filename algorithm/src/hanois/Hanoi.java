package hanois;

public class Hanoi {
	private int tray=3; //접시 수
	private int bar=3; //막대 수는 변경 불가
	int[][] rings;
	//접시 수를 변경하고 접시의 크기를 표현하기 위해 2차원 배열에 1,3,5를 대입하는 생성자
	public Hanoi(int tray) {
		this.tray=tray; //접시 수 변경
		rings=new int[tray][bar];
		for(int i=0; i<rings.length; i++) {
			int x=2*i+1;
			rings[i][0]=x;
		}
	}
	//외부에 접시의 크기를 표현하는 배열을 반환한다.
	public int[][] getRings(){
		return rings;
	}
	//접시 수 num, 막대 이름 3개를 입력받는다.
	public void moveHanoi(int num, char ringA, char ringB, char ringC) {
		//접시가 1장 일때는 A막대에서 B막대로 가장 큰 접시를 옮기는 경우가 한 번 발생한다. 그러므로 재귀가 끝나는 조건은 접시가 1장일 때이다.
		if(num==1) {
			//A막대에서 B막대로 접시를 이동하는 것을 출력하고 재귀를 끝낸다.
			System.out.println(ringA+"bar쪽에 있던 링이 "+ringB+"bar쪽으로 이동");
		}
		else {
			//접시가 2장 이상일 때 접시를 1장 줄여서 생각해야 한다. 그러므로 n-1이 된다.
			//그리고 c막대로 접시를 옮기는 과정이 있어야 하므로 moveHanoi(A막대에서 C막대로, B막대를 사용해서)를 다시 호추한다.
			moveHanoi(num-1,ringA,ringB,ringC);
			//A막대에서 B막대로 옮기는 것이 목표이므로 현대 막대와 옮길 막대를 출력한다.
			System.out.println(ringA+"bar쪽에 있던 링이 "+ringB+"bar쪽으로 이동");
			//다른 재귀도 필요한데 C막대에서 B막대로 이동해야 한다. moveHanoi(C막대에서 B막대로, A막대를 사용해서를 다시 호출한다.)
			moveHanoi(num-1,ringC,ringB,ringA);
		}
	}
}
