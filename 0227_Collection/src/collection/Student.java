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
	public String toString() { //toString메소드 오버로딩
		return memberId + " : " + memberName;
	}
	
	@Override
	public int hashCode() { //기본적으로 인스턴스 주소가 같으면 같은 객체이다.
		return memberId;// 하지만 해당 예제(set)에선 회원 아이디가 같아도 같은 회원이다.
	}  						// Member클래스에서 equals()와 hashCode()를 재정의해
	@Override				// 회원 아이디가 같으면 같은 회원임을 구현해주어야 한다.
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student member = (Student)obj;
			if(this.memberId == member.memberId)return true;
			else return false;
		}
		return false;
	}
}
