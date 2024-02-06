package solve;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int nowWeight = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int goalWeight = sc.nextInt();
		int looseWeight = 0;
		int week = 1;
		while (nowWeight > goalWeight) {
			System.out.print(week + "주차 감량 몸무게 : ");
			looseWeight = sc.nextInt();
			nowWeight = nowWeight - looseWeight;
			week++;
		}

		System.out.println(nowWeight + "kg 달성!! 축하합니다!");

	}

}
