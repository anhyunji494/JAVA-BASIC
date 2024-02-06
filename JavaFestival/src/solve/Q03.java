package solve;

public class Q03 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				i = i * 1;
				System.out.print(i + " ");
				sum = sum + i;
			} else if (i % 2 == 0) {
				i = i * -1;
				sum = sum + i;
				System.out.print(i + " ");
				i = i * -1;
			}
		}
		
		System.out.println();
		System.out.print("결과 : "+sum);

	}

}
