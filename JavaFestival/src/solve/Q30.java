package solve;

import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] inputs = input.split(" ");

		for (String answers : inputs)
			;

		for (int i = 0; i <= 26; i++) {
			for (char j = 'a'; j <= 'z'; j++) {
				if (answers[i]) {
					j++;
				}
			}

		}

		int count = 0;
		for (int i = 0; i <= 26; i++) {
			if (inputs[i].equalsIgnoreCase(answers[i])) {
				count++;
			}
		}

	}

}
