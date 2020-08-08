package lv_1;

import java.util.Arrays;

public class k¹øÂ°¼ö {
	public static int[] solution(int[] array, int[][] commands) {

		int[] answer2 = new int[commands.length];

		int o2 = 0;
		for (int i = 0; i < commands.length; i++) {
			int o = 0;
			int idx1 = 0;
			int idx2 = 0;
			idx1 = commands[i][0]; // 2
			idx2 = commands[i][1];// 5
			int[] answer1 = new int[idx2 - idx1 + 1];
			for (int j = idx1 - 1; j < idx2; j++) { // 1 <= j < 5 
				answer1[o] = array[j];
				o++;
			}
			Arrays.sort(answer1);
			answer2[o2] = answer1[commands[i][2] -1];
			o2++;
		}
			
		for(int k=0 ; k<answer2.length; k++) {
			System.out.println(answer2[k]);
		
		}
		
		return answer2;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		// System.out.println(commands[0][2]);
		System.out.println(solution(array, commands));

	}
}
