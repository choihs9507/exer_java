package algorithm;

public class ArrayTwoInit {
	public static void main(String[] args) {
		System.out.println("//2차원 배열 방법1");
		int[][] a = new int[4][3];
		for(int i=0; i<a.length; i++) { //a.length는 행의 개수
			for(int j=0; j<a[i].length; j++) { //a[i].length는 i행의 개수
				if(j!=2 && i==0) {
					System.out.print("["+(j+1)+"]");
				}
				else System.out.print("["+0+"]");
			}
			System.out.println(" ");
		}
		System.out.println("//2차원 배열 방법2");
		int[][] d = {
				{0,0,0,0},
				{0,0,0,0,0},
				{0,0,0}
		};
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print("["+0+"]");
			}
			System.out.println("");
		}
		
		
		
		System.out.println("//2차원 배열 방법3");
		int[][] b = new int[3][5];
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				if(i==2) {
					b[i][j]=(i+j+4)%10;
					System.out.print("["+(i+j+4)%10+"]");
				}
				else{
					b[i][j]=(i+j+1);
					System.out.print("["+(i+j+1)+"]");
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("//2차원 배열 방법4");
		int[][] c = new int[3][5];
		for(int i=0; i<c.length; i++) {
		System.arraycopy(b[i], 0, c[i], 0, b[i].length);
		}
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.print("["+c[i][j]+"]");
			}
			System.out.println("");
		}
	
		
		}
	}
