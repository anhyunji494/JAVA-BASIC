package solve;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		System.out.print("반올림 수 : " + (int)(double)Math.round(num / 10.0) * 10);
	}

}
