package algorithm;
import java.util.Scanner;

public class OddMagicSquareMain {

	public static void main(String[] args) {
		Scanner scann=new Scanner(System.in);
		System.out.println("Ȧ�� ������ �Է��ϼ���.");
		int n=scann.nextInt();
		OddMagicSquare odd = new OddMagicSquare();
		
		odd.make(n);
		odd.print(n);
		
	}
}


