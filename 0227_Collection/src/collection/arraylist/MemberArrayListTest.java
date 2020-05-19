package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		Member memberSong = new Member(1005,"�۱浿");
		
		//ArrayList�� ȸ�� �߰�
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
