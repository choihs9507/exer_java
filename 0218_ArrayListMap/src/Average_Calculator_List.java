//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Average_Calculator_List {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(100); //영어
		scores.add(95);  //수학
		scores.add(80);  //물리
		scores.add(50);  //프로그래밍
		//리스트는 .add함수사용

		double sum=0;
		
		for (int i=0; i<scores.size(); i++) { //리스트 크기는 .size()
			sum=sum+scores.get(i);
		}
		double average= sum/4;
		
		
		//double average = (double)(scores.get(0)+scores.get(1)+scores.get(2)+scores.get(3))/4;
		System.out.println(average);
	}
}

