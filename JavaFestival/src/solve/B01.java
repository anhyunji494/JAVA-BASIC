package solve;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;

		while (a != 0 && b != 0) {
			System.out.print("A 입력 >> ");
			a = sc.nextInt();
			System.out.print("B 입력 >> ");
			b = sc.nextInt();
			
			if (a == 0 && b == 0) {
				break;
			}
			
			System.out.println("결과 >> " + (a - b));
		}

	}

}
