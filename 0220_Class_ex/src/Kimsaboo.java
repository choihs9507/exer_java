
public class Kimsaboo {
	
	int age; //������� 
	String name;
	boolean merry;
	int son;
	
	public static void main(String[] args) {
			
		Kimsaboo ex = new Kimsaboo(); //��ü����, ��������� �����Լ����� �ν��ϱ� ���ؼ� (��ü ���� ���)
		ex.age = 50; //ex.��ü �Ⱦ��� �����Լ����� �ν� �Ұ�
		ex.name = "kimsaboo";
		ex.merry = true;
		ex.son = 4;
		
		System.out.println("�� ����� ���� : "+ex.age);
		System.out.println("�� ����� �̸� : "+ex.name);
		System.out.println("�� ����� ��ȥ ���� : "+ex.merry);
		System.out.println("�� ����� �ڳ� �� : "+ex.son);
		
	}
}

