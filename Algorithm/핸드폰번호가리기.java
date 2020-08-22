package Algorithm;

class 핸드폰번호가리기 {
	public String solution(String phone_number) {
		String answer = "";
		String[] arr = phone_number.split("");
		for (int i = 0; i < phone_number.length() - 4; i++) {
			arr[i] = "*";
		}
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}
}