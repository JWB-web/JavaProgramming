class Solution {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n]; 
		long[] newarr = new long[answer.length]; // 2의 제곱 배열
		int idx = 0; // 2의 제곱 배열 인덱스 번호

		for (int i = 0; i < answer.length; i++) {
			answer[i] = "";
		} // answer 배열 초기화

		for (int i = newarr.length - 1; i >= 0; i--) {
			newarr[idx] = (long) Math.pow(2, i);// 제곱 하는 함수 16 8 4 2 1
			idx++;
		} // 2의 제곱 배열 배열 생성

		long[] a = new long[answer.length]; // 값을 2진법으로 바꾼 배열
		int idx2 = 0; // 2진법 배열 인덱스

		for (int i = 0; i < arr1.length; i++) { //  ex) 9, 20, 28, 18, 11
			for (int j = 0; j < newarr.length; j++) { // ex) 16 8 4 2 1
			if (arr1[i] - newarr[j] >= 0) { 
					arr1[i] = (int) (arr1[i] - newarr[j]);
					if (arr1[i] >= 0) {
						a[idx2] += (long) Math.pow(10, (a.length - j - 1));
					}
				}
				if (arr2[i] - newarr[j] >= 0) {
					arr2[i] = (int) (arr2[i] - newarr[j]);
					if (arr2[i] >= 0) {
						a[idx2] += (long) Math.pow(10, (a.length - j - 1));
					}
				}
			}
			idx2++;
		}

		int idx3 = 0;

		for (int i = 0; i < answer.length; i++) {
			for (long j = (long) Math.pow(10, (answer.length - 1)); j > 0; j = j / 10) {
				if ((a[i] / j) >= 1) {
					answer[idx3] += "#";
				} else if ((a[i] / j) == 0) {
					answer[idx3] += " ";
				}
				a[i] = a[i] % j;
			}
			idx3++;
		}

		for (int i = 0; i < answer.length; i++) {
			int d = n - answer[i].length();
			if (d > 0) {
				for (int j = 0; j < d; j++) {
					answer[i] = " " + answer[i];
				}
			}
		}

		return answer;
	}
}
