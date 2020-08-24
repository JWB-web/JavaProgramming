package Algorithm;

public class 문자열다루기기본 {
	public boolean solution(String s) {
		boolean answer = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57 && s.length() == 4 || s.length() == 6) {
				answer = true;

			} else {
				answer = false;
				break;
			}

		}

		return answer;
	}
}