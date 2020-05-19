import java.util.Scanner;

public class Sorttest {
	public static void main(String[] args){
		System.out.println("정렬을 선택하세요(퀵정렬 : Q 버블정렬 : B 힙정렬 : H)");
		
		Scanner a = new Scanner(System.in);
		String input = a.next();
		a.close();
		
		Sort sort = null;
		
		if(input.equalsIgnoreCase("H")) {
			System.out.println("Heap Sort");
			sort = new HeapSort();
		}
		else if(input.equalsIgnoreCase("B")) {
			System.out.println("Bubble Sort");
			sort = new BubbleSort();		
		}
		else if(input.equalsIgnoreCase("Q")) {
			System.out.println("Quick Sort");
			sort = new QuickSort();
		}
		else System.out.println("잘못 입력했습니다.");
		
		sort.ascending();
		sort.descending();
		sort.description();
	}
}
