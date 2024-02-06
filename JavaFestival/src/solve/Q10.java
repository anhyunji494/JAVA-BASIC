package solve;

import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] array = new int[8];

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
		}

		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int max = 0;
		int min = 100;

		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (max < num) {
				max = num;
			}
		}

		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			if (min > num) {
				min = num;
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
