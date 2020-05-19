package hanois;

public class HanoiUtil {
	public static void moveHanoi(int [][] a, int num, char ringA, char ringB, char ringC) {
		if(num==1) {
			showHanoi(a,ringA,ringB); // A���뿡�� B����� ���ø� �̵��ϴ� ���� �迭�� ����ϰ� ��͸� ������.
		}else {
			//���ð� 2�� �̻��� ���� ���ø� 1�� �ٿ��� �����ؾ� �Ѵ�. �׷��Ƿ� n-1�� �ȴ�. �׸��� c����� ���ø� �ű�� ������ �־�� �ϹǷ�
			//moveHanoi(A���뿡�� C�����, B���븦 ����ؼ�)�� �ٽ� ȣ���Ѵ�
			moveHanoi(a,num-1,ringA,ringC,ringB);
			//A���뿡�� B����� �ű�� ���� ��ǥ�̹Ƿ� ���� ����� �ű� ���븦 �迭�� ȣ���Ѵ�.
			showHanoi(a,ringA,ringB);
			//�ٸ� ��͵� �ʿ��ѵ� C���뿡�� B����� �̵��ؾ� �Ѵ�. moveHanoi(C���뿡�� B�����, A���븦 ����ؼ�)�� �ٽ� ȣ���Ѵ�.
			moveHanoi(a,num-1,ringC,ringB,ringA);
		}
	}
	//ringA���뿡�� ringB����� ���ø� �̵��ϴ� ������ ǥ���Ѵ�.
	public static void showHanoi(int[][] a, char ringA, char ringB) {
		int aa=0; //���ø� � ���뿡�� �ű���� �ϴ��� ã�´�.  ringA�� � ����
		int ab=1; //���ø� � ����� �ű���� �ϴ��� ã�´�. ringB�� � ����
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
		//���ø� ��� ���뿡�� ��� ����� �̵��ߴ��� ����Ѵ�.
		System.out.println(ringA+"bar�ʿ� �ִ� ���� "+ringB+"bar������ �̵�");
		//18,19���ο��� ã�� ���븦 �̿��ؼ� ���� �ű�� ���� ��ġ�� 0���� �����.
		//C������ 3�� B����� �ű���� �Ѵٸ� C���뿡 3���� ū ���� �ִ��� �Ǵ��ϰ� ���� ���ų� 3���� ū ���� �ִٸ� 3�� B����� �ű��
		//3�� �ִ� ������ ���� 0���� �����Ѵ�.
		puts(a,aa,ab);
		// ������ �̵��� �迭�� ǥ�������Ƿ� 2���� �迭�� ����Ѵ�. ������ �̵� ����� ��µȴ�.
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
	//�׸� 2�� ���� ���ڸ� �ű� �� �̹� ���ڰ� �ִٸ� ���� �ø��� ������ �ʿ��ϴ�. �� �� �̹� ���ڰ� �ִ��� �Ǵ��Ѵ�.
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
	//change(a,2,2,0,0); ==> 2,2�� ����  0,0���� �̵�, 2,2�� ���� 0���� 
	//�׸� 2�� ���� ���ڸ� �ű� �� �̹� ���ڰ� �ִٸ� ���� �ø��� ������ �ʿ��ϴ�. �迭�� ���ڸ� �ű�� �̵��� ���� ���� ��ġ���� 0���� �����Ѵ�.
	private static void change(int[][] a, int aa, int ab, int ba, int bb) {
		System.out.println("("+aa+","+ab+")==>"+"("+ba+","+bb+") :");
		a[ba][bb]=a[aa][ab];
		a[aa][ab]=0;
	}
	//�׸� 2�� ���� ���ڸ� �ű� �� �̹� ���ڰ� �ִٸ� ���� �ø��� ������ �ʿ��ϴ�.
	//�տ��� �ߴ� �۾�(�ű���� �ϴ� ��ġ�� �̹� ���ڰ� �ִ��� �Ǻ��ϰ�, ���ڸ� �ű� ���� ���� ��ġ�� ���� 0���� �����Ѵ�)�� �����Ѵ�.
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
