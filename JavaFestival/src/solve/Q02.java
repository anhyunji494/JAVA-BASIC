package solve;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int work = sc.nextInt();
		
		double sum = 0; 
		
		if(work<=8) {
			sum=5000*work;
		} else {
			sum = 5000 * work * 1.5;
		}
		System.out.println("총 임금은 "+sum+"원 입니다. ");
	}

}
