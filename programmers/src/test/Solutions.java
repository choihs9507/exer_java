//프로그래머스 해시 전화번호

package test;

import java.util.Arrays;

class Solutions {
    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){ 
                System.out.println("false");
            	return false; 
            }
        }
        System.out.println("true");
        return true;
    }

public static void main(String[] args) {
	String[] a1 = {"119", "97674223", "1195524421"};
	solution(a1);
	}

}
