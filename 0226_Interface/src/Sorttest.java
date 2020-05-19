import java.util.Scanner;

public class Sorttest {
	public static void main(String[] args){
		System.out.println("������ �����ϼ���(������ : Q �������� : B ������ : H)");
		
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
		else System.out.println("�߸� �Է��߽��ϴ�.");
		
		sort.ascending();
		sort.descending();
		sort.description();
	}
}
