package algorithm;

public class sixMabangjin {
	static int[][] m = new int[9999][9999];
	static int[][] m1 = new int[9999][9999];
	
	public static void make(int n) {
		/////////////////////////////////////////A����
		int x=(int)n/4-1;
		for(int a=0; a<n/2; a++) {
			m[a][x]=3;
		}
		m[(int)n/4][x+1]=m[(int)n/4][x];
		m[(int)n/4][x]=0;
		/////////////////////////////////////////B����
		for(int b=n/2; b<n; b++) {
			for(int b1=0; b1<n/2; b1++) {
				m[b1][b]=2;
			}
		}
		///////////////////////////////////////D����
		for(int d=n/2; d<n; d++) {
			for(int d1=n/2; d1<n; d1++) {
				m[d1][d]=1;
			}
		}
		///////////////////////////////////////C����
		for(int a1=0; a1<n/2; a1++) {
			for(int a=0; a<n/2; a++) {
				if(m[a1][a] == 3) {
					m[a1+3][a] = 0;
				}
				else {
					m[a1+3][a] = 3;
				}
			}
		}
		///////////////////////////////////////��� ���� ���ϱ�
		for(int x1=0; x1<n; x1++) {
			for(int y1=0; y1<n; y1++) {
				m[x1][y1]=m[x1][y1]*(n/2*n/2);
			}
		}
		///////////////////////////////////////������ ���ϱ�
		submake(n/2);
		for(int x2=0; x2<n; x2++) {
			for(int y2=0; y2<n; y2++) {
				m[x2][y2]=m[x2][y2] + m1[x2%(n/2)][y2%(n/2)];
			}
		}
	}
	public static void print(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", m[i][j]);
			}
			System.out.println(" ");
		}
	}
	
	public static void submake(int odd) {
		int x=0;
		int y=(int)odd/2;
		int tempx;
		int tempy;
		
		for(int i=1; i<=odd*odd; i++) {
			m1[x][y]=i; //�迭�� �� ����
			tempx=x; //���� ��ġ ����
			tempy=y;
			x--;
			y--;
			if(x<0) {x=odd-1;}
			if(y<0) {y=odd-1;}
			
			if(m1[x][y]!=0) {
				x=tempx;
				y=tempy;
				x++;
				if(x==odd) {x=0;}
			}
		}
	}
	
	public static void main(String[] args) {
		int n=6;
		make(n);
		print(n);
	}
	
}
	
		
		
		

		
