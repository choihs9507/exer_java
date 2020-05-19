package algorithm;

public class JSort {
	
	public static void print(int []n) {
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static void BubbleSort(int []n) {
		
//		for(int i=0; i<n.length-1; i++) { 
//			for(int j=n.length-1; j>i; j--) { //1회차에 제일 작은 수가 처음에 정렬 됨
//				if(n[j-1]>n[j]) {
//					int temp=0;
//					temp=n[j-1];
//					n[j-1]=n[j];
//					n[j]=temp;
//				}
//			}
//		}
//	}
//}
		for(int i=0; i<n.length-1; i++) { 
			for(int j=0; j<n.length-1-i; j++) { //1회차에 제일 큰 수가 처음에 정렬 됨
				if(n[j]>n[j+1]) {
					int temp=0;
					temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}
}
