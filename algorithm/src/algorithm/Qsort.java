package algorithm;

public class Qsort {
	
	public static void Quicksort(int[] n, int start, int end) {
		
	}
	
	public static int partition(int[] n, int start, int end) { //2���� ������ �Լ�
		int mid = (int)(start+end)/2;
		while(start <= end) {//�����Ǹ� �ȵ�
			while(n[start] < n[mid]) start++; //�߰������� Ŭ������  start����
			while(n[end] > n[mid]) end--;	  //�߰������� ���������� end����, ������ �ȵ�
			
			if(start <= end) { //mid���� ū start�� end���� �տ� �ִٸ�
				swap(n, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	public static void swap(int[] n, int start, int end) { //�ٲٴ� �Լ�
		int temp=0;
		temp=n[end];
		n[end]=n[start];
		n[start]=temp;
	}
	
	public static void print(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}