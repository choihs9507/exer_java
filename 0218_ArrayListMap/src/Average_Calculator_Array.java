
//Array로 평균 구하기

public class Average_Calculator_Array {
	public static void main(String[] args) {
		int[] scores = new int[4];
		scores[0]=100; //영어
		scores[1]=95; // 수학
		scores[2]=80; //물리
		scores[3]=70; //프로그래밍
		//배열은 직접 인덱스로 추가
		
		double sum=0;
		for (int i=0; i<scores.length; i++) { //배열크기는 .length
			sum=sum+scores[i];
		}
		double average=sum/4;
		
		//float average = (float) (scores[0]+scores[1]+scores[2]+scores[3])/4;
		
		System.out.println(average);
		
	}
}
