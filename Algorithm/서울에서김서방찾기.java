package Algorithm;

class ���￡���輭��ã�� {
	public String solution(String[] seoul) {
		int a = 0;

		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				a = i;
				break;
			}
		}
		String answer = "�輭���� " + a + "�� �ִ�";
		return answer;
	}
}