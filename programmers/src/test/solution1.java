//heap �� �ʰ�

package test;

import java.util.PriorityQueue; //���� ť�� ���Լ��������� �켱����ť�� �Է��� ��������� ����� ���� ���� �ͺ��� ������.
import java.util.Queue;
import java.util.Arrays;

public class solution1 {

	public static int solution(int[] scov, int k) {
		int answer = 0;
		int times = 0;
		
		Queue<Integer> pq = new PriorityQueue<Integer>(scov.length);
		
		for(int i=0; i<scov.length-1; i++) { //���ĵ��� pq�� ����
			pq.add(scov[i]);
		}
		
		while (pq.size()>1) {
			if(pq.peek() >= k) {
				answer = times;
				break;
			}
			int s1 = pq.poll();
			int s2 = pq.poll();
			int sco = s1 + s2*2;
			pq.add(sco);
			times++;
		}
		
		
		return answer;
	}
}
