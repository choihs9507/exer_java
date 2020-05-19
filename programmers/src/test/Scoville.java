package test;

import java.util.*;

public class Scoville {
	public static int solution(int[] scoville, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for (int i=0; i<scoville.length; i++) {
			q.add(scoville[i]);
		}
		
		int count = 0;
		while(q.size() > 1 && q.peek() < k){ //배열이 1개 이상이고 제일 작은 값이 K보다 작으면 계속 돌림
			int week = q.poll(); //.poll은 제일 작은 값을 빼냄 .peek은 제일 작은 값만 확인하는 것 poll. peek은 우선순위큐에서 포함된 메소드
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
		int[] scoville = {10,3,2,1,9,10,12}; //배열의 길이는 length, 콜렉션타입(리스트)의 길이는 size
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		ArrayList<Integer> qq = new ArrayList<Integer>();
		
		for(int i = 0; i<scoville.length; i++) {
			qq.add(scoville[i]);
		}
		System.out.println("그냥 어레이리스트"+qq);
		
		
		for(int i = 0; i<scoville.length; i++) {
			q.add(scoville[i]);
		}
		
		System.out.println("우선순위큐 " + q);
		
		System.out.println("횟수는 "+solution(scoville,5));
	}
}
