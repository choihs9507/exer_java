package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Student;

public class StudentHashSet {
	private HashSet<Student> hashSet;
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	
	public void addMember(Student member) {
		hashSet.add(member);
	}
	
	public void showAllMember() {
		for(Student member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	public boolean removeMember(int memberId) {
		Iterator<Student> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Student member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
}
