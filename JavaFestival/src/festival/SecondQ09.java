package festival;

import java.util.Random;

public class SecondQ09 {

	public static void main(String[] args) {
		Random ran = new Random();

		int[] lucky = new int[6];
		int[] temp = new int[6];

		for (int i = 0; i < lucky.length; i++) {
			lucky[i] = ran.nextInt(45) + 1;
			temp[i] = lucky[i];
			for (int j = 1; j < 6; j++) {
				if (lucky[i] == temp[i]) {
					lucky[i] = temp[i] - 1;
				}
			}
		}

		for (int i = 0; i < lucky.length; i++) {
			System.out.println("행운의 숫자" + lucky[i]);
		}

	}

}
