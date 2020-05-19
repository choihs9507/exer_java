package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//회원 인스턴스 생성
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서훤");
		Member memberHong = new Member(1004,"홍길동");
		Member memberSong = new Member(1005,"송길동");
		
		//ArrayList에 회원 추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(memberSong,5);
		memberArrayList.showAllMember();
	}
}
