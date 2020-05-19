package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap { 
	private HashMap<Integer, Member> hashMap;  //hashMap ���� ����
	
	public MemberHashMap() { //������ ����
		hashMap = new HashMap<Integer, Member>();//HashMap�� ����key�� member�� value�� ����(�ʱ�ȭ)
	}
	
	public void addMember(Member member) { //HashMap�� ȸ���� �߰��ϴ� �޼ҵ�
		hashMap.put(member.getMemberId(),member); //Key-value ������ �߰� put����
	}
	
	public boolean removeMember(int memberId) { //HashMap���� ȸ���� �����ϴ� �޼ҵ�
		if(hashMap.containsKey(memberId)) { //HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
			hashMap.remove(memberId); //�ش� ȸ�� ����
			return true;
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
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
