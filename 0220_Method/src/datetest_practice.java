import java.util.Scanner;

/*
 * 2020.02.20
 * �����
 * MyDateTest
 */
public class datetest_practice {
   public static void main(String[] args) {
      Scanner today = new Scanner(System.in);

      for (;;) {
         System.out.println("��¥�� �Է����ּ���.");
         
         System.out.print("���� : ");
         int y = today.nextInt();
         
         System.out.print("�� : ");
         int m = today.nextInt();
         
         System.out.print("�� : ");
         int d = today.nextInt();

         if (d == 0 && m == 0 && y == 0) {
            System.out.println("���α׷��� �����մϴ�.");
            break;
         } else {
            MyDate date = new MyDate(d, m, y);
            date.isValid();
            System.out.println(" ");

         }
      }
   }
}