import java.util.Arrays;
class Solution {
  	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		
			for (int i = 0; i < completion.length; i++) {
				if(!completion[i].equals(participant[i])) {
					answer = participant[i];
                    break;
				} else if (completion[completion.length-1].equals(participant[completion.length-1])) {
					answer = participant[completion.length];
                  
				}
		}

		return answer;
	}}
