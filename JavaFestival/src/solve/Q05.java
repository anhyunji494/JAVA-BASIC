package solve;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int limit = sc.nextInt();
		String output = "";
		
		for (int i = 0; i < limit; i++) {
			String star = "*";
			output = output.concat(star);
			System.out.println(output);
		}
	}

}
