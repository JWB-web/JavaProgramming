class Solution {
public static int[] solution(int[] answers) {

		int[] student1 = new int[10000];
		int[] student2 = new int[10000];
		int[] student3 = new int[10000];

		for (int i = 0; i < answers.length; i += 5) {
			student1[i] = 1;
			student1[i + 1] = 2;
			student1[i + 2] = 3;
			student1[i + 3] = 4;
			student1[i + 4] = 5;

		}

		for (int i = 0; i < answers.length; i += 8) {
			student2[i] = 2;
			student2[i + 1] = 1;
			student2[i + 2] = 2;
			student2[i + 3] = 3;
			student2[i + 4] = 2;
			student2[i + 5] = 4;
			student2[i + 6] = 2;
			student2[i + 7] = 5;

		}

		for (int i = 0; i < answers.length; i += 10) {
			student3[i] = 3;
			student3[i + 1] = 3;
			student3[i + 2] = 1;
			student3[i + 3] = 1;
			student3[i + 4] = 2;
			student3[i + 5] = 2;
			student3[i + 6] = 4;
			student3[i + 7] = 4;
			student3[i + 8] = 5;
			student3[i + 9] = 5;

		}
		int student1count = 0;
		int student2count = 0;
		int student3count = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student1[i]) {
				student1count++;
			}
		}
    
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student2[i]) {
				student2count++;
			}
		}
    
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == student3[i]) {
				student3count++;
			}
		}

		int[] result1 = new int[1];
		result1[0] = 1;

		int[] result2 = new int[1];
		result2[0] = 2;

		int[] result3 = new int[1];
		result3[0] = 3;

		int[] result4 = new int[2];
		result4[0] = 1;
		result4[1] = 2;

		int[] result5 = new int[2];
		result5[0] = 1;
		result5[1] = 3;

		int[] result6 = new int[2];
		result6[0] = 2;
		result6[1] = 3;

		int[] result7 = new int[3];
		result7[0] = 1;
		result7[1] = 2;
		result7[2] = 3;


		if (student1count > student2count && student1count > student3count) {
			return result1;
		} else if (student2count > student1count && student2count > student3count) {
			return result2;
		} else if (student3count > student1count && student3count > student2count) {
			return result3;
		} else if (student1count == student2count && student1count > student3count) {
			return result4;
		} else if (student1count == student3count && student1count > student2count) {
			return result5;
		} else if (student2count == student3count && student2count > student1count) {
			return result6;
		} else if (student2count == student3count && student2count == student1count) {
			return result7;
		} else
			return result7;

	}}
