package LottoEx;
import java.util.Arrays;

public class Lotto6Num {
	private int[] lots; //�迭 ����
	private int base; //��ü �� ���� 45
	private int ballNum; //������ �� ���� 6
	//�ζ� ���� ������ �迭�� ������ �ζ� ���� ����(�迭�� ũ��) �����ϰ�, �迭 ����
	public Lotto6Num(int base, int ballNum) {
		this.ballNum=ballNum;
		this.base=base;
		//�迭 ����
		lots=new int[ballNum];
	}
	
	public Lotto6Num() { //���� ���� 45, �迭 ũ�� 6���� �ʱ�ȭ
		this(45,6); //?�� ���� �ٷ� �ȳְ� this��??
	}
	
	//������ �迭 ���
	public void print() {
		for(int i=0; i<lots.length; i++) {
			if(i==lots.length-1) {
				System.out.printf("%d ",lots[i]);
			}else {
				System.out.printf("%d, ", lots[i]);
			}
		}
		System.out.println();
	}
	//������ ���� �����
	private int rand() {
		return (int)(Math.random()*base)+1; //randon()�� 0.xxxx ~ 0.99999
	}
	//n�� �迭�� ���ԵǴ��� �Ǵ�, �ߺ��� �� �����ϱ� ����
	public boolean contain(int n) {
		boolean isC=false;
		for (int i=0; i<lots.length; i++) {
			if(lots[i]==n) {
				isC=true;
				break;
			}
		}
		return isC;
	}
	public void make() {
		Arrays.fill(lots, 0); //�迭 0���� �ʱ�ȭ
		int count=0;
		while(count!=ballNum) { //6���� �ٸ� ������ ä���� ������ �ݺ�
			int temp=rand(); //1~45���� ���� ���� �����
			if(!contain(temp)) { //�迭�� ���ԵǾ� ���� ������ �迭�� ����, ���� ���� ����
				lots[count++]=temp;
			}
		}
		Arrays.sort(lots); //�迭�� ���������� ����
	}
	public int[] getLots() {
		return lots;
	}
}
