package algorithm;

public class sum1_100 {
	public static void main(String[] args) {
		
		System.out.println("1~100������ ��");
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		System.out.println("1~100���� Ȧ���� ��");
		int sum1=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
			sum1=sum1+i;
			}
		}
		System.out.println(sum1);
		
//		System.out.println("1~100���� Ȧ���� ��");
//		int sum2=0;
//		for(int i=1; i<=100; i=i+2) {
//			sum2=sum2+i;
//		}
//		System.out.println(sum2);
	}
}
