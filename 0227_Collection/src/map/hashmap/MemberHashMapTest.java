package map.hashmap;

import collection.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark = new Member(1001, "�ڻ�����");
		Member memberCho = new Member(1002, "���̼�");
		Member memberOh = new Member(1003, "������");
		Member memberJang = new Member(1004, "��ټ�");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberCho);
		memberHashMap.addMember(memberOh);
		memberHashMap.addMember(memberJang);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
