package lv_1;

public class �ݶ������� {
	public int solution(int num) {

		int answer = 0;

		long num1 = num; // answer Ƚ���� 500 �̻��� ��� -1�� ����ϴµ� �� ��� int Ÿ���� ������ �Ѿ�� long Ÿ������

		while (num1 != 1) { // num1 �� 1�� �ƴ� ��� �ݺ�, num1 �� 1�� ��� ����

			if (num1 % 2 != 0) { // Ȧ��

				num1 = num1 * 3 + 1;

				answer++;

			} else if (num1 % 2 == 0) { // ¦��

				num1 = num1 / 2;

				answer++;

			}

			if (answer > 500) { // 500ȸ �̻� �ݺ� �ÿ��� 1�� �ƴ� ��� -1�� ���� �� �극��ũ

				answer = -1;

				break;

			}

		}

		return answer;

	}

}