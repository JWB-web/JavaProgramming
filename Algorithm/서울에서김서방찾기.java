package Algorithm;

class 서울에서김서방찾기 {
	public String solution(String[] seoul) {
		int a = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				a = i;
				break;
			}
		}
		String answer = "김서방은 " + a + "에 있다";
		return answer;
	}
}