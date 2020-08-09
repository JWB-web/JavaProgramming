package Algorithm;

public class 같은숫자는싫어 {
	public int[] solution(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				count++;
			}
		}
		int[] answer = new int[count];

		int idx = 0;

		for (int j = 0; j < arr.length - 1; j++) {
			if (arr[j] != arr[j + 1]) {
				answer[idx] = arr[j];
				idx++;
			}
		}

		answer[answer.length - 1] = arr[arr.length - 1];

		return answer;
	}
}