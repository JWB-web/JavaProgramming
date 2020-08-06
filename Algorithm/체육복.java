package Algorithm;

public class 체육복 {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = 31; // 최대 30명 이하의 학생수라서 겹치지 않게 하기위해 31로 설정
		}

		int count = 0;
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					count++;
				}
			}
		}
		// 도난 당했지만 여유분이 있는 학생의 배열을 만들기 위한 배열길이 설정

		int idx = 0;
		int[] d = new int[count];
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					d[idx] = lost[i];
					idx++;
				}
			}
		}
		// 도난 당했지만 여유분이 있는 배열

		for (int j = 0; j < reserve.length; j++) {
			result[reserve[j] - 1] = 2; // 여유분을 가지고있는 학생은 2로 설정

		}

		for (int k = 0; k < lost.length; k++) {
			result[lost[k] - 1] = 0; // 도난 당한 학생은 0으로 설정

		}

		for (int o = 0; o < d.length; o++) {
			result[d[o] - 1] = 1; // 도난 당한 학생이지만 여유분을 가진 학생은 1으로 설정

		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] == 31) { // 31은 도난을 당하지도 여유분을 가지고 있지 않는 학생 이므로 1으로 설정
				result[i] = 1;

			}
		}

		for (int m = 0; m < result.length - 1; m++) {
			if (result[m] - result[m + 1] == 2) {
				result[m] = 1;
				result[m + 1] = 1;
			}
		}

		for (int m = 0; m < result.length - 1; m++) {
			if (result[m] - result[m + 1] == -2) {
				result[m] = 1;
				result[m + 1] = 1;
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] >= 1) {
				answer++;
			}
		}
		return answer;
	}

}