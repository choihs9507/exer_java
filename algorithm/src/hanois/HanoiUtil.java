package hanois;

public class HanoiUtil {
	public static void moveHanoi(int [][] a, int num, char ringA, char ringB, char ringC) {
		if(num==1) {
			showHanoi(a,ringA,ringB); // A막대에서 B막대로 접시를 이동하는 것을 배열로 출력하고 재귀를 끝낸다.
		}else {
			//접시가 2장 이상일 때는 접시를 1장 줄여서 생각해야 한다. 그러므로 n-1이 된다. 그리고 c막대로 접시를 옮기는 과정이 있어야 하므로
			//moveHanoi(A막대에서 C막대로, B막대를 사용해서)를 다시 호출한다
			moveHanoi(a,num-1,ringA,ringC,ringB);
			//A막대에서 B막대로 옮기는 것이 목표이므로 현재 막대와 옮길 막대를 배열로 호출한다.
			showHanoi(a,ringA,ringB);
			//다른 재귀도 필요한데 C막대에서 B막대로 이동해야 한다. moveHanoi(C막대에서 B막대로, A막대를 사용해서)를 다시 호출한다.
			moveHanoi(a,num-1,ringC,ringB,ringA);
		}
	}
	//ringA막대에서 ringB막대로 접시를 이동하는 과정을 표현한다.
	public static void showHanoi(int[][] a, char ringA, char ringB) {
		int aa=0; //접시를 어떤 막대에서 옮기려고 하는지 찾는다.  ringA가 어떤 막대
		int ab=1; //접시를 어떤 막대로 옮기려고 하는지 찾는다. ringB가 어떤 막대
		switch(ringA) {
		case'a': aa=0; break;
		case'b': aa=1; break;
		case'c': aa=2; break;
		}
		switch(ringB) {
		case'a': ab=0; break;
		case'b': ab=1; break;
		case'c': ab=2; break;
		}
		//접시를 어느 막대에서 어느 막대로 이동했는지 출력한다.
		System.out.println(ringA+"bar쪽에 있던 링이 "+ringB+"bar쪽으로 이동");
		//18,19라인에서 찾은 막대를 이용해서 값을 옮기고 원래 위치를 0으로 만든다.
		//C막대의 3을 B막대로 옮기려고 한다면 C막대에 3보다 큰 값이 있는지 판단하고 값이 없거나 3보다 큰 값이 있다면 3을 B막대로 옮기고
		//3이 있던 막대의 값을 0으로 변경한다.
		puts(a,aa,ab);
		// 접시의 이동을 배열로 표현했으므로 2차원 배열을 출력한다. 접시의 이동 모습이 출력된다.
		showHanoi(a);
	}
	public static void showHanoi(int[][] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print("[\t");
			for(int j=0; j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("]");
		}
		System.out.println("=============================================");
	}
	//그림 2와 같이 숫자를 옮길 때 이미 숫자가 있다면 위로 올리는 과정이 필요하다. 이 때 이미 숫자가 있는지 판단한다.
	public static int hasTray(int[][] a, int bar) {
		int no=-1;
		for(int i=0; i<a.length; i++) {
			if(a[i][bar]!=0) {
				no=i;
				break;
			}
		}
		return no;
	}
	//change(a,2,2,0,0); ==> 2,2의 값을  0,0ㅇ로 이동, 2,2의 값을 0으로 
	//그림 2와 같이 숫자를 옮길 때 이미 숫자가 있다면 위로 올리는 과정이 필요하다. 배열에 숫자를 옮기고 이동괸 수의 원래 위치값을 0으로 변경한다.
	private static void change(int[][] a, int aa, int ab, int ba, int bb) {
		System.out.println("("+aa+","+ab+")==>"+"("+ba+","+bb+") :");
		a[ba][bb]=a[aa][ab];
		a[aa][ab]=0;
	}
	//그림 2와 같이 숫자를 옮길 때 이미 숫자가 있다면 위로 올리는 과정이 필요하다.
	//앞에서 했던 작업(옮기려고 하는 위치에 이미 숫자가 있는지 판별하고, 숫자를 옮긴 다음 원래 위치의 값을 0으로 변경한다)을 실행한다.
	public static void puts(int[][] a, int barA, int barB) {
		if(hasTray(a,barA)!=-1) {
			if(hasTray(a,barB)!=-1) {
				change(a,hasTray(a,barA),barA,hasTray(a,barB)-1,barB);
			}else {
				change(a,hasTray(a,barA),barA,a.length-1,barB);
			}
		}
	}
}
