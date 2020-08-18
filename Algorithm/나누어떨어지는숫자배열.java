package Algorithm;

import java.util.*;

class 나누어떨어지는숫자배열 {
	public int[] solution(int[] arr, int divisor) {
		int count = 0;
		int c = 0;
		int[] a = { -1 };
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] % divisor == 0) {
				count++;
			}
		}
		int[] answer = new int[count];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[c] = arr[i];
				c++;
			}

		}
		Arrays.sort(answer);
		if (answer.length == 0) {
			return a;
		} else
			return answer;
	}
}