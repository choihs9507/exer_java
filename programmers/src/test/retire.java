package test;
import java.util.*;

public class retire { //완주하지 못한 선수
	
	    public static String solution(String[] par, String[] com) {
	        Arrays.sort(par);
	        Arrays.sort(com);
	        
	        for (int i=0; i<com.length; i++){
	            if (!par[i].equalsIgnoreCase(com[i])) return par[i];
	        }
	        return par[par.length-1];
	    }
	
	public static void main(String[] args) {
		String[] par = {"leo","kiki","eden"};
		String[] com = {"eden","kiki"};
		
		System.out.println(solution(par,com));
		}
	}

