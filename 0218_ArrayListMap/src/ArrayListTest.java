import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(97);
		scores.add(93);
		
		//scores.remove(0);
		//scores.remove(1);
		//scores.remove(2);
		
		
		for (int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i));
		}
	}
}