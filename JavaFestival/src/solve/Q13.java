package solve;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {

		String score = "A, A, B, C, D, A, C, D, D, D, F";

		String[] scores = score.split(", ");

//		for (int i = 0; i < scores.length; i++) {
//			System.out.print(scores[i] + " ");
//		}
//		
		// for-each문

//		for(String s: scores) {
//			System.out.print(s + " ");
//		}

//		System.out.println(Arrays.toString(scores));

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i].equals("A")) {
				cntA++;
			} else if (scores[i].equals("B")) {
				cntB++;
			} else if (scores[i].equals("C")) {
				cntC++;
			} else if (scores[i].equals("D")) {
				cntD++;
			} else {
				cntF++;
			}
		}

		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");

	}

}
