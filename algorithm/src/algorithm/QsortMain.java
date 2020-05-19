package algorithm;
//import java.util.Arrays;

public class QsortMain {
	
	public static void main(String[] args) {
	    int [] m={67,700,735,287,830,360,753,332,899,616,990,890,933,975,275
	    ,707,271,80,409,602,875,813,208,949,183,504,721,494,159,549,
	    95,818,85,444,703,961,928,193,846,660,433,253,547,436,467,751,
	    684,284,481,439,12,18,421,4,394,458,829,633,474,359,454,541,
	    601,471,326,889,345,555,710,614,540,353,795,116,119,133,859,280,413,
	    689,861,966,709,938,600,190,81,544,406,692,765,179,
	    32,629,437,804,911,42,836,770};  // 100개인 배열을 선언하고 초기화한다.
	    int []n=new int[m.length]; //크기가 100인 배열 생성
	    System.arraycopy(m, 0, n, 0, m.length); //배열 m을 배열 n에 복사. m과 n은 같은 원소들을 갖지만 다른 배열이다
	    
	    
	    
	    Qsort.print(n); // 일차원 배열 출력
	    long a=System.nanoTime(); //현재시간

	    Qsort.Quicksort(n,0,n.length-1);  //버블소트 정렬
	    long b =System.nanoTime();  //정렬후시간

	    System.out.println((b-a)+"nano sec");  // 10의 -9승 / 정렬 시간을 구하고, 
	    Qsort.print(n); //정렬된 일차원 배열 출력
	    
//	    Arrays.sort(m);
//	    Qsort.print(m);
		}
	}