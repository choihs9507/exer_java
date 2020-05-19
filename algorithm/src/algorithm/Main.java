package algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		hanoi(n, 'A', 'B', 'C');
		
	} // end main()
	
	public static void hanoi(int n, char a, char b, char c) {
		if (n == 1) {
			printLog(n, a, c);
		} else {
			hanoi((n-1), a, c, b);
			printLog(n, a, c);
			hanoi((n-1), b, a, c);
		}
	}
	
	public static void printLog(int n, char start, char end) {
		System.out.println("Disk " + n + " : " + start + " to " + end);
	}
} // end Main[출처] CodeUp 3420 : 하노이 탑 1 (자바 풀이)|작성자 도레미레이


