package collection.arraylist;

import java.util.ArrayList;
import collection.Member; //collection��Ű���� MemberŬ������ import�ϰڴ�.

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //����� ������ ArrayList����
	}
	public void addMember(Member member) { //ArrayList�� ��� �߰�
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) { //��� ���̵� �Ű�������, ���� ���θ� ��ȯ
		for(int i=0; i<arrayList.size(); i++) { //�ش� ���̵� ���� ����� ArrayList ���� ã��
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) { //��� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i); //�ش� ����� ����
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�."); //for�� ������ ���� return�� �ȵ� ���
		return false;
	}
	public void showAllMember() { //��ü ȸ���� ���
		for(Member member : arrayList) { //���� for��
			System.out.println(member.toString());
		}
		System.out.println();
	}
	public void insertMember(Member member, int index) {
		if(index<1 || index>arrayList.size()+1) {
			System.out.println("��ġ�� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		arrayList.add(index-1, member);
	}
}
