package Algorithm;

public class ������ڰ������� {
	public String solution(String s) {
		String answer = "";
		String[] a = s.split("");
		for (int i = 0; i < a.length; i++) {
			if (a.length % 2 == 0) {
				return a[a.length / 2 - 1] + a[a.length / 2];
			} else {
				return a[a.length / 2];
			}
		}
		return answer;
	}
}