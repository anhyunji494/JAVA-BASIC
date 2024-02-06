package solve;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();

		int of10000 = money / 10000;
		int of5000 = money % 10000 / 5000;
		int of1000 = money % 10000 % 5000 / 1000;
		int of500 = money % 10000 % 5000 % 1000 / 500;

		System.out.println("잔돈 : " + money);
		System.out.println("10000원 : " + of10000);
		System.out.println("5000원 : " + of5000);
		System.out.println("1000원 : " + of1000);
		System.out.println("500원 : " + of500);

	}

}
