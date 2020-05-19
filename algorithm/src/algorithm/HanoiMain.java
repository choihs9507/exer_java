package algorithm;
import java.util.Scanner;

public class HanoiMain {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int tray = a.nextInt();
		
		Hanoi ha = new Hanoi(tray);
		ha.moveHanoi(tray,'a','b','c');
		System.out.println("접시가 "+3+"개일 때, 이동 횟수는 "+Hanoi.count);
	}
}
