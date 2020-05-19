import java.util.List;
import java.util.ArrayList;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		//스트림 생성하고 출력하기
		System.out.println("모든 책의 가격의 합");
		int total = bookList.stream().mapToInt(s->s.getPrice()).sum();
		System.out.println(total);
		System.out.println();
		
		System.out.println("20000원 이상인 책");
		bookList.stream().filter(a->a.getPrice()>=20000).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}
}
