
public class randNum3 {
	
	private static int rand() {
		return (int)(Math.random()*10)+1; //randon()Àº 0.xxxx ~ 0.99999
	}
	public static void main(String[] args) {
	
	int n1 = 0, n2 = 0, n3 = 0;
	while((n1==n2) || (n1==n3) || (n2==n3)) {
		n1 = rand();
		n2 = rand();
		n3 = rand();
		
	}
	System.out.println(n1+"/"+n2+"/"+n3);
}
}
