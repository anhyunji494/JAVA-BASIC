package festival;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();

		
		int num = 1; 
		for (int i = 1; i <= n; i++) {
			System.out.println(num+i);
			num = num+i;
		}
		
		
		
		

	}
}
