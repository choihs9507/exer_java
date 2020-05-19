package test;

import java.util.*;

public class Scoville {
	public static int solution(int[] scoville, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for (int i=0; i<scoville.length; i++) {
			q.add(scoville[i]);
		}
		
		int count = 0;
		while(q.size() > 1 && q.peek() < k){ //�迭�� 1�� �̻��̰� ���� ���� ���� K���� ������ ��� ����
			int week = q.poll(); //.poll�� ���� ���� ���� ���� .peek�� ���� ���� ���� Ȯ���ϴ� �� poll. peek�� �켱����ť���� ���Ե� �޼ҵ�
			int week2 = q.poll();
			//System.out.println(week+" "+week2);
			int mix = week + (week2*2);
			
			q.add(mix);
			count++;
		}
		
		if (q.peek() < k && q.size()<=1) {
			return -1;
		}
		return count;
	}
	////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int[] scoville = {10,3,2,1,9,10,12}; //�迭�� ���̴� length, �ݷ���Ÿ��(����Ʈ)�� ���̴� size
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		ArrayList<Integer> qq = new ArrayList<Integer>();
		
		for(int i = 0; i<scoville.length; i++) {
			qq.add(scoville[i]);
		}
		System.out.println("�׳� ��̸���Ʈ"+qq);
		
		
		for(int i = 0; i<scoville.length; i++) {
			q.add(scoville[i]);
		}
		
		System.out.println("�켱����ť " + q);
		
		System.out.println("Ƚ���� "+solution(scoville,5));
	}
}
