package algorithm;
import java.util.Scanner;

public class HanoiMain {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int tray = a.nextInt();
		
		Hanoi ha = new Hanoi(tray);
		ha.moveHanoi(tray,'a','b','c');
		System.out.println("���ð� "+3+"���� ��, �̵� Ƚ���� "+Hanoi.count);
	}
}
