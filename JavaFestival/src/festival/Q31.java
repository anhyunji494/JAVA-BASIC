package festival;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int input = sc.nextInt();

		int result = 1;

		for (int i = 1; i <= input; i++) {
			result = result * i;
		}

		System.out.print("출력 : " + result);

	}

}
