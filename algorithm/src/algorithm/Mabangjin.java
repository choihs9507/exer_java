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
			m[x][y]=i; //배열에 값 저장
			tempx=x; //먼저 위치 저장
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
		
		System.out.println("홀수 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int odd = sc.nextInt();
		Mabangjin.make(odd);
		Mabangjin.print(odd);
		
	}
}
