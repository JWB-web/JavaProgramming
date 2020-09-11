class Solution {
 public static String solution(String s, int n) {
		String answer = "";
		int a;
		for (int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if (a >= 65 && a <= 90) {
				a += n;
				if (a > 90) {
					a = a - 26;
				}
			} else if (a >= 97 && a <= 122) {
				a += n;
				if (a > 122) {
					a = a - 26;
				}
			} else if (a == 32) {
				a += 0;
			}
			char result= (char)a;
			answer += result;
		}

		return answer;
	}
}
