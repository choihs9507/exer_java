
public class InnerTest {
	public static void main(String[] args) {
		
		//�ܺ� Ŭ������ �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		
		System.out.println();
		
		System.out.println("��������Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();
		
	}
}
