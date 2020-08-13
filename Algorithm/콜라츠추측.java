package lv_1;

public class 콜라츠추측 {
	public int solution(int num) {

		int answer = 0;

		long num1 = num; // answer 횟수가 500 이상일 경우 -1을 출력하는데 그 경우 int 타입의 범위를 넘어가서 long 타입으로

		while (num1 != 1) { // num1 이 1이 아닐 경우 반복, num1 이 1일 경우 멈춤

			if (num1 % 2 != 0) { // 홀수

				num1 = num1 * 3 + 1;

				answer++;

			} else if (num1 % 2 == 0) { // 짝수

				num1 = num1 / 2;

				answer++;

			}

			if (answer > 500) { // 500회 이상 반복 시에도 1이 아닐 경우 -1을 리턴 후 브레이크

				answer = -1;

				break;

			}

		}

		return answer;

	}

}