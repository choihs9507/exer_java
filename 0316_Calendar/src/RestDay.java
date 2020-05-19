import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RestDay {
	//��, �Ͽ����ΰ�?? �ش� ���� �ָ��� ã�Ƴ��� �ڵ�
	
	public static boolean isRest(Calendar tod) { //����(tod)�� �����ΰ�
		boolean isRest=false; //�⺻�� false
		if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||
				tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			//tod�� ������ ������̰ų� �Ͽ����̸�
			isRest=true; //�����̴�.
		}
		return isRest;
	}
	
	//Calendar�� ���ڿ���
	public static String toYMD(Calendar dd) { //��¥���¸� ���ڿ��� �ٲٴ� �޼ҵ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //yyyy-mm-dd���·�
		//SimpleDateFormat�̶�� Ŭ������ ����ؼ� �ν��Ͻ� ����
		return sdf.format(dd.getTime()); //����Ʈ ������ get�ؼ� yyyy-mm-dd���·� �ٱ���
		//��¥�� �ð��� format���·�
	}
	
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance(); //������ ������ ����� Calendar ����
		int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH); //�̴��� ������ ���� ����
		for(int i=1;i<=lastDay;i++) {
			cal.set(Calendar.DAY_OF_MONTH,i); //1�Ϻ��� ������������
			if(isRest(cal)) { //����(��, ��) Ȯ��
				System.out.println(toYMD(cal)+"�� �����Դϴ�.");
			}
			
		}
	}
}
