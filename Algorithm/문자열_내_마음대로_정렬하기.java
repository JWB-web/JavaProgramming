import java.util.Arrays;

class Solution {
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		Arrays.sort(strings);
		char[] a = new char[strings.length];
		// strings 각 원소의 n 번째 문자 배열
		
		for (int i = 0; i < strings.length; i++) {
			a[i] = strings[i].charAt(n);
		}
		Arrays.sort(a);
		
		int idx = 0; //인덱스 번호
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < strings.length; j++) {
				if (a[i] == strings[j].charAt(n)) {
					answer[idx] = strings[j];
					idx++;
					strings[j] = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
					break;
				}
			}
		}

		return answer;
	}
}
