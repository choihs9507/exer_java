package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap { 
	private HashMap<Integer, Member> hashMap;  //hashMap 변수 선언
	
	public MemberHashMap() { //생성자 선언
		hashMap = new HashMap<Integer, Member>();//HashMap은 정수key랑 member형 value를 가짐(초기화)
	}
	
	public void addMember(Member member) { //HashMap에 회원을 추가하는 메소드
		hashMap.put(member.getMemberId(),member); //Key-value 쌍으로 추가 put으로
	}
	
	public boolean removeMember(int memberId) { //HashMap에서 회원을 삭제하는 메소드
		if(hashMap.containsKey(memberId)) { //HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
			hashMap.remove(memberId); //해당 회원 삭제
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
