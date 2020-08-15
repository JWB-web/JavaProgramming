package Algorithm;

public class 문자열내p와y의개수 {
	static boolean solution(String s) {
		String a[] = s.split("");
		int count_p = 0;
		int count_y = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase("p")) {
				count_p++;
			}
			if (a[i].equalsIgnoreCase("y")) {
				count_y++;
			}
		}
		if (count_p == count_y) {
			return true;
		} else
			return false;

	}
}