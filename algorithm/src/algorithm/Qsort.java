package algorithm;

public class Qsort {
	
	public static void Quicksort(int[] n, int start, int end) {
		int a=partition(n, start, end);
		if(start<a-1) Quicksort(n, start, a-1);
		if(a<end) Quicksort(n,a,end);
	}
	public static int partition(int[] n, int start, int end) { //2개로 나누는 함수
		int mid= (int)(start+end)/2; //중간값 설정
		while (start <= end) { //교차되면 안돼
			while (n[start] < n[mid]) start++; // 중간값보다 클때까지 start증가
			while (n[end] > n[mid]) end--; // 중간값보다 작을때까지 end감소. 같으면 안됨
			
			if (start <= end) { //mid보다 큰 start가 end보다 앞에 있다면
				swap(n, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	public static void swap(int[] n, int start, int end) { //바꾸는 함수
		int temp=0;
		temp=n[end];
		n[end]=n[start];
		n[start]=temp;
	}
	
	public static void print(int[] n) { //프린트 함수
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}
