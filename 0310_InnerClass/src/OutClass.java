
class OutClass {
	private int num = 10; //�ܺ�Ŭ������ �ν��Ͻ� ����
	private static int sNum = 20; //�ܺ�Ŭ������ ����ƽ ����
	
	static class InStaticClass{ //��������Ŭ����
		int inNum = 100;	//��������Ŭ������ �ν��Ͻ� ����
		static int sInNum = 200;  //��������Ŭ������ ��������
		
		void inTest() {	//��������Ŭ������ �Ϲ� �޼���
//			num += 10; //�ܺ�Ŭ������ �ν��Ͻ� ������ ����� �� ����
			System.out.println("InStaticClass inNum = "+inNum+"(����Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(����Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ�Ŭ������ ����ƽ ���� ���)");
		}
		static void sTest() {	//��������Ŭ������  static�޼���
//			num += 10;	//�ܺ�Ŭ������ �ν��Ͻ� ������ ����� �� ����
//			inNum += 10; //��������Ŭ������ �ν��Ͻ� ������ ����� �� ����
			System.out.println("OutClass sNum = "+sNum+"(�ܺ�Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass sInNum = "+sInNum+"(����Ŭ������ ����ƽ ���� ���)");
		}
	} //����Ŭ��������  ����ƽ������ ��� ���� / �ν��Ͻ� ������ �Ұ�(��������Ŭ������ �Ϲ� �޼��忡�� ����Ŭ������ �ν��Ͻ� ���� ����)
}
