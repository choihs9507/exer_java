package collection;

public class Student {
	private int memberId;
	private String memberName;
	
	public Student(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() { //toString�޼ҵ� �����ε�
		return memberId + " : " + memberName;
	}
	
	@Override
	public int hashCode() { //�⺻������ �ν��Ͻ� �ּҰ� ������ ���� ��ü�̴�.
		return memberId;// ������ �ش� ����(set)���� ȸ�� ���̵� ���Ƶ� ���� ȸ���̴�.
	}  						// MemberŬ�������� equals()�� hashCode()�� ��������
	@Override				// ȸ�� ���̵� ������ ���� ȸ������ �������־�� �Ѵ�.
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student member = (Student)obj;
			if(this.memberId == member.memberId)return true;
			else return false;
		}
		return false;
	}
}
