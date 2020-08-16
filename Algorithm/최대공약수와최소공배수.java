package Algorithm;

class 최대공약수와최소공배수 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		if (n >= m) {
			for (int i = n; i > 0; i--) {
				if (n % i == 0 && m % i == 0) {
					answer[0] = i;
					break;
				}
			}
			for (int j = m; j <= n * m; j++) {
				if (j % m == 0 && j % n == 0) {
					answer[1] = j;
					break;
				}
			}
		} else if (n < m) {
			for (int i = m; i > 0; i--) {
				if (m % i == 0 && n % i == 0) {
					answer[0] = i;
					break;
				}
			}
			for (int j = n; j <= n * m; j++) {
				if (j % n == 0 && j % m == 0) {
					answer[1] = j;
					break;
				}
			}
		}
		return answer;
	}
}