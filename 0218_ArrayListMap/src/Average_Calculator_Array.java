
//Array�� ��� ���ϱ�

public class Average_Calculator_Array {
	public static void main(String[] args) {
		int[] scores = new int[4];
		scores[0]=100; //����
		scores[1]=95; // ����
		scores[2]=80; //����
		scores[3]=70; //���α׷���
		//�迭�� ���� �ε����� �߰�
		
		double sum=0;
		for (int i=0; i<scores.length; i++) { //�迭ũ��� .length
			sum=sum+scores[i];
		}
		double average=sum/4;
		
		//float average = (float) (scores[0]+scores[1]+scores[2]+scores[3])/4;
		
		System.out.println(average);
		
	}
}
