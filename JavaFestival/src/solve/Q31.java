package solve;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int n = sc.nextInt();

		int nFact = 1;
		for (int i = 1; i <= n; i++) {
			nFact = nFact * i;
		}
		System.out.print("출력 : " + nFact);
	}

}
