package algorithm;
import java.util.Scanner;

public class Mabangjin {
	
	static int[][]m=new int[9999][9999];
	
	public static void make(int odd) {
		int x=0;
		int y=(int)odd/2;
		int tempx;
		int tempy;
		
		for(int i=1; i<=odd*odd; i++) {
			m[x][y]=i; //�迭�� �� ����
			tempx=x; //���� ��ġ ����
			tempy=y;
			x--;
			y--;
			if(x<0) {x=odd-1;}
			if(y<0) {y=odd-1;}
			
			if(m[x][y]!=0) {
				x=tempx;
				y=tempy;
				x++;
				if(x==odd) {x=0;}
			}
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
		
		System.out.println("Ȧ�� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int odd = sc.nextInt();
		Mabangjin.make(odd);
		Mabangjin.print(odd);
		
	}
}
