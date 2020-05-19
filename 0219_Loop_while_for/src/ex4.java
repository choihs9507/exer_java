import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		for (;;) {
			String text = input1.next();
			if(text.equalsIgnoreCase("exit")) break;
			else System.out.println(text);
		}
		
	}
}