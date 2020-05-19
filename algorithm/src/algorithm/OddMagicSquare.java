package algorithm;

public class OddMagicSquare {
	static int[][] m = new int[9999][9999];
	
	public static void make(int odd) {
			int startx=0;
			int starty= (int)odd/2;
			
			for(int n=1; n<=odd*odd; n++) {
				m[startx][starty] = n;
				int tempx=startx; //�ǵ��� �� x
				int tempy=starty; //�ǵ��� �� y
				startx--;
				starty--;
				if(startx<0) { //���� ������
					startx=odd-1;
				}
				if(starty<0) { //���� �� ������
					starty=odd-1;
				}
				
				if(m[startx][starty]!=0) { //�̹� �� ������
					startx=tempx;
					starty=tempy;
					startx=startx+1;
					if(startx>odd) startx=0;
				}
				if(n==odd*odd) break;
			}
		}
	
	public static void print(int odd) {
		for(int i=0; i<odd; i++) {
			for(int j=0; j<odd; j++) {
				System.out.printf("%4d",m[i][j]);
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		OddMagicSquare.make(3);
		OddMagicSquare.print(3);
	}
	
}
