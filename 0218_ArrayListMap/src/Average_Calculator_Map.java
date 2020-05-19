import java.util.Map;
import java.util.HashMap;


public class Average_Calculator_Map {
	public static void main(String[] args) {
		Map<String,Integer> scores = new HashMap<String,Integer>();
		
		scores.put("eng",100);
		scores.put("math",93);
		scores.put("phy",81);
		scores.put("pro",99);
		//맵은 .put함수 사용
		
		double average = (double)(scores.get("eng")+scores.get("math")+scores.get("phy")+scores.get("pro"))/4;
		System.out.println(average);
	}
}