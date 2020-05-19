package collection.arraylist;

import java.util.ArrayList;
import collection.Member; //collection패키지의 Member클래스를 import하겠다.

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //멤버로 선언한 ArrayList생성
	}
	public void addMember(Member member) { //ArrayList에 멤버 추가
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) { //멤버 아이디를 매개변수로, 삭제 여부를 반환
		for(int i=0; i<arrayList.size(); i++) { //해당 아이디를 가진 멤버를 ArrayList 에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) { //멤버 아이디가 매개변수와 일치하면
				arrayList.remove(i); //해당 멤버를 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다."); //for가 끝날때 까지 return이 안된 경우
		return false;
	}
	public void showAllMember() { //전체 회원을 출력
		for(Member member : arrayList) { //향상된 for문
			System.out.println(member.toString());
		}
		System.out.println();
	}
	public void insertMember(Member member, int index) {
		if(index<1 || index>arrayList.size()+1) {
			System.out.println("위치를 잘못 입력하셨습니다.");
			return;
		}
		arrayList.add(index-1, member);
	}
}
