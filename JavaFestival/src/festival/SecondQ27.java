package festival;

import java.util.Scanner;

public class SecondQ27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String answer = sc.next();
		int cnt = 0;
		answer.charAt(0)
		
		if(answer.equals("o")) {
			cnt++;
		}
		
//		switch (answer.charAt(0)) {
//		case "o":
//			cnt++;
//			break;
//
//		default:
//			break;
//		}
		
//		String[] array = answer.split("x");
//		
//		if(array.equals("x")) {
//			cnt++;
//		}
//		
		System.out.println(cnt);
		
	}
}
