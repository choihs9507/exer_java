//heap 더 맵게

package test;

import java.util.PriorityQueue; //보통 큐는 선입선출이지만 우선순위큐의 입력은 상관없지만 출력은 가장 작은 것부터 제거함.
import java.util.Queue;
import java.util.Arrays;

public class solution1 {

	public static int solution(int[] scov, int k) {
		int answer = 0;
		int times = 0;
		
		Queue<Integer> pq = new PriorityQueue<Integer>(scov.length);
		
		for(int i=0; i<scov.length-1; i++) { //음식들을 pq에 넣음
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
