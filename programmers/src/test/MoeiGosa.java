//프로그래머스 완전탐색 모의고사
package test;

import java.util.*;

class MoeiGosa {
    public static int[] solution(int[] answers) {
        int[] ans1 = {1,2,3,4,5};
        int ans11=0;
        int[] ans2 = {2,1,2,3,2,4,2,5};
        int ans22=0;
        int[] ans3 = {3,3,1,1,2,2,4,4,5,5};
        int ans33=0;
        ArrayList answer = new ArrayList<>();
        
        for (int i=0; i<answers.length; i++){
            if (answers[i] == ans1[i%ans1.length]){
                ans11++;
            }
        }
        for (int i=0; i<answers.length; i++){
            if (answers[i] == ans2[i%ans2.length]){
                ans22++;
            }
        }
        for (int i=0; i<answers.length; i++){
            if (answers[i] == ans3[i%ans3.length]){
                ans33++;
            }
        }
        if (ans11 == Math.max(ans11,Math.max(ans22,ans33))){answer.add(1);}
        if (ans22 == Math.max(ans11,Math.max(ans22,ans33))){answer.add(2);}
        if (ans33 == Math.max(ans11,Math.max(ans22,ans33))){answer.add(3);}
        
        System.out.println(ans11+" "+ans22+" "+ans33);
        //ArrayList를 배열로 바꾸는 방법
        int[] answer1 = new int[answer.size()];
        for(int i=0; i<answer1.length; i++) {
        	answer1[i]=(int) answer.get(i);
        }
        return answer1;
    }
    
    public static void main(String[] args) {
    	int[] answers = {1,2,3,4,5,5,4,5,1,6,5,4,8,7,1,2,3,4,5,1,2,3,2,1,2,1,3};
    	System.out.println(solution(answers));
    }
}