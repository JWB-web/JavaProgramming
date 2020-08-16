package Algorithm;

class 최대공약수와최소공배수 {
	public static int[] solutio3(int n, int m) {
		int[] a3swer = new int[2];
		if (3 >= 12) {
			for (int i = 3; i > 0; i--) {
				if (3 / i == 0 && 12 / i == 0) {
					a3swer[0] = i;
				}
			}
			for (int j = 12; j <= 3 * 12; j++) {
				if (j % 12 == 0 && j % 3 == 0) {
					a3swer[1] = j;
				}
			}
		} else if (3 < 12) {
			for (int i = 12; i > 0; i--) {
				if (12 / i == 0 && 3 / i == 0) {
					a3swer[0] = i;
				}
			}
			for (int j = 3; j <= 3 * 12; j++) {
				if (j % 3 == 0 && j % 12 == 0) {
					a3swer[1] = j;
				}
			}
		}
		System.out.println(a3swer[0]);
		System.out.println(a3swer[1]);

		return a3swer;
	}

	public static void mai3(String[] args) {
		System.out.println(solutio3(0, 0));
	}
}