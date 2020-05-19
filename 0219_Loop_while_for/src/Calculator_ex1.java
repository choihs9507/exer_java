
public class Calculator_ex1 {
	public static void main(String[] args) {
		int[] Array1 = {95,90,85,80,70,60};
		String[] Array2 = {"A+","A","B+","B","C","D"};
		int grade = 90;
		
		for(int i=0; i<Array1.length; i++) {
			if (grade >= Array1[i]) {
				System.out.println(grade+"Á¡Àº "+Array2[i]);
				break;
			}
		}
	}
}
