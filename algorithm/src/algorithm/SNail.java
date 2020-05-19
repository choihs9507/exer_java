package algorithm;

public class SNail {
	static int[][] a = new int[7][7];
	
	public static void make() {
		int r = 0;
		int c = -1;
		int sw = 1;
		int v = 1;
		int length= a.length;
		while (true) {
			for (int i = 0; i < length; i++) {
				c=c+sw;
				a[r][c]=v;
				v++;
			}
			length--;
			if(length<0) break;
			
			for(int i = 0; i < length; i++) {
				r=r+sw;
				a[r][c]=v;
				v++;
			}
			sw=sw*(-1);
		}
	}		
	
	public static void print() {
		for(int x=0; x<a.length; x++) {
			for(int y=0; y<a.length; y++) {
				System.out.printf("%4d",a[x][y]);
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		SNail.make();
	}
}
