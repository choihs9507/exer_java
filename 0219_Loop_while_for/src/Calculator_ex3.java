//import java.util.Scanner;

public class Calculator_ex3 {
	public static void main(String[] args) {
		int[] Array1 = {95,90,85,80,70,60};
		String[] Array2 = {"A+","A","B+","B","C","D"};
		int grade = 90;
		//Scanner text = new Scanner(System.in);
		int i=0;
		
		for(;;) {
			if (grade >= Array1[i]) {
				System.out.println(grade+"Á¡Àº "+Array2[i]);
				break;
			}
			i=i+1;
		}
	}
}
