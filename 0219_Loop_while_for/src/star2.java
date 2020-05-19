
public class star2 {
	public static void main(String[] args) {
		int start = 9;
		int line = 5;
		int spacecount=1;

		for (int i=0; i<line; i++) { //i=0,1,2,3,4
			for(int a=0; a<spacecount; a++) {
				System.out.print(' ');
				}
			for(int j=0; j<start; j++) {
				System.out.print('*');
			}
			System.out.println(' ');
			
			spacecount++;
			start=start-2;
		}
	
	}
}