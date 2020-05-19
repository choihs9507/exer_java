package algorithm;

public class test {
	public static int[] solution(int[][] v) {
        int[] answer = new int[2];

        for(int i=0; i<2; i++){
            if((v[0][i]!=v[1][i]) && (v[0][i]!=v[2][i])){
                answer[i]=v[0][i];
           
            }
            if(v[1][i]!=v[0][i] && v[1][i]!=v[2][i]){
                answer[i]=v[1][i];
           
            }
            if (v[2][i]!=v[0][i] && v[2][i]!=v[1][i]){
                answer[i]=v[2][i];
           
            }
            
    }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] answer = new int[2];
		int[][] v = {{1,4},
					{3,4},
					{3,10}};
		
		for(int i=0; i<2; i++){
            if((v[0][i]!=v[1][i]) && (v[0][i]!=v[2][i])){
                answer[i]=v[0][i];
           
            }
            if(v[1][i]!=v[0][i] && v[1][i]!=v[2][i]){
                answer[i]=v[1][i];
           
            }
            if (v[2][i]!=v[0][i] && v[2][i]!=v[1][i]){
                answer[i]=v[2][i];
           
            }
            
    }
		System.out.println(v[2][1]!=v[0][1]);
		System.out.println(v[0][1]);
		System.out.println(answer[0]+" "+answer[1]);
		
		
//		solution(v);
	}
}
