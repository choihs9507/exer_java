import java.util.List;
import java.util.ArrayList;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�",25000));
		bookList.add(new Book("���̽�",15000));
		bookList.add(new Book("�ȵ���̵�",30000));
		
		//��Ʈ�� �����ϰ� ����ϱ�
		System.out.println("��� å�� ������ ��");
		int total = bookList.stream().mapToInt(s->s.getPrice()).sum();
		System.out.println(total);
		System.out.println();
		
		System.out.println("20000�� �̻��� å");
		bookList.stream().filter(a->a.getPrice()>=20000).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}
}
