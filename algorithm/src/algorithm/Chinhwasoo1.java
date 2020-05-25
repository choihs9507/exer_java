package algorithm;

public class Chinhwasoo1 {
	
	public static int dividesum(int a) { //약수합
		int sum=0;
		for(int i=1; i<=a/2; i++) {
			if(a%i == 0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void divideprint(int a) {
		int sum=0;
		System.out.print("[");
		for(int i=1; i<a; i++) {
			if(a%i==0) {
				System.out.print(i+",");
			sum=sum+i;
			}
		}
		System.out.print(a+"]"+"총합 = "+sum);
		System.out.println(" ");
	}
	
	public static void calc(int a, int b) {
		for(int i=a; i<b; i++) {
			for(int j=i; j<b; j++) {
				if((i!=j)&&(j==dividesum(i) && i==dividesum(j))) {
					System.out.println(i+", "+j+"는 친화수 관계");
					divideprint(i);
					divideprint(j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		calc(2,5000);
	}
}
