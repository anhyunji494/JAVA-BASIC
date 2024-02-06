package festival;

import java.util.Scanner;

public class ThirdQ02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한 시간을 입력하세요");
		int time = sc.nextInt();
		int result = 0;

		if (time <= 8) {
			result = 5000 * time;
		} else {
			result = (time - 8) * 1.5 * 5000;
		}

		System.out.println();
	}

}
