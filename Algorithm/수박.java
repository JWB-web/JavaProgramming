package lv_1;

public class ���� {
	public String solution(int n) {
	        String answer = "";
	        
	        for(int i=1 ; i<=n;i++) {
	            if(i %2 != 0) {
	                answer += "��";
	            } else if(i%2 ==0){
	                answer += "��";
	            }
	        }
	        return answer;
	    }

}
