package Algorithm;

public class ü���� {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = 31; // �ִ� 30�� ������ �л����� ��ġ�� �ʰ� �ϱ����� 31�� ����
		}

		int count = 0;
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					count++;
				}
			}
		}
		// ���� �������� �������� �ִ� �л��� �迭�� ����� ���� �迭���� ����

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
		// ���� �������� �������� �ִ� �迭

		for (int j = 0; j < reserve.length; j++) {
			result[reserve[j] - 1] = 2; // �������� �������ִ� �л��� 2�� ����

		}

		for (int k = 0; k < lost.length; k++) {
			result[lost[k] - 1] = 0; // ���� ���� �л��� 0���� ����

		}

		for (int o = 0; o < d.length; o++) {
			result[d[o] - 1] = 1; // ���� ���� �л������� �������� ���� �л��� 1���� ����

		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] == 31) { // 31�� ������ �������� �������� ������ ���� �ʴ� �л� �̹Ƿ� 1���� ����
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