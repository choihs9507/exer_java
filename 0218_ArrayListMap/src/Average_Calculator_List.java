//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Average_Calculator_List {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(100); //����
		scores.add(95);  //����
		scores.add(80);  //����
		scores.add(50);  //���α׷���
		//����Ʈ�� .add�Լ����

		double sum=0;
		
		for (int i=0; i<scores.size(); i++) { //����Ʈ ũ��� .size()
			sum=sum+scores.get(i);
		}
		double average= sum/4;
		
		
		//double average = (double)(scores.get(0)+scores.get(1)+scores.get(2)+scores.get(3))/4;
		System.out.println(average);
	}
}

