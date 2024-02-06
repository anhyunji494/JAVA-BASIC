package solve;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("행 개수 : ");
		int line = sc.nextInt();
		
		for(int i=line; i<=0; i--) {
			System.out.print("*");
		}
		
	}

}
