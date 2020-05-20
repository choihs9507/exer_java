package algorithm;

public class SNail1 {
	
	public static void make(int n) {
		int[][] m = new int[n][n];
		int a=0; //x
		int b=-1; //y
		int s=1;
		int val=1;
		
		for(int i=1; i<=n*n; i++) {
			
			for(int y=0; y<n; y++) {
				b=b+(1*s);
				m[a][b] = val;
				val++;
			}
			n--;
			
			for(int x=0; x<n; x++) {
				a=a+(1*s);
				m[a][b] = val;
				val++;
			}
			s=s*(-1);
		}
		
		for(int z=0; z < m.length; z++) {
			for(int c=0; c< m.length; c++) {
				System.out.printf("%4d",m[z][c]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		SNail1.make(9);
	}
}
