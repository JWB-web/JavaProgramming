class Solution {
    public boolean solution(int x) {
        boolean answer = true;
		if (x < 10) {
			int a = x % 10;
			if (x % a == 0) {
				answer = true;
			} else {
				answer = false;
			}
		} else if (x < 100) {
			int a = x % 10;
			int b = x / 10;
			int c = a + b;
			if (x % c == 0) {
				answer = true;
			} else {
				answer = false;
			}
		} else if (x < 1000) {
			int a = x / 100;
			int b = (x / 10) % 10;
			int c = x % 10;
			int d = a + b + c;
			if (x % d == 0) {
				answer = true;
			} else {
				answer = false;
			}
		} else if (x < 10000) {
			int a = x / 1000;
			int b = (x / 100) % 10;
			int c = (x / 10) % 10;
			int d = x % 10;
			int e = a + b + c + d;
			if (x % e == 0) {
				answer = true;
			} else {
				answer = false;
			}
		}
	 return answer;
}
}
