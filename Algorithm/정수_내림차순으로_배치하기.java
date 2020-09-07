import java.util.Arrays;
class Solution {
	public static long solution(long n) {
		long answer = 0;
		String a ="";
		String s = Long.toString(n); // long 타입을 String 타입으로 변환
		String[] result = s.split(""); // 한 글자씩 자르기
		Arrays.sort(result); // 오름차순 정렬
		for(int i =result.length-1; i>=0 ;i--) {
			a += result[i];
		}
		answer = Long.parseLong(a); // String 타입을 long 타입으로 변환
		return answer;
	}
}
