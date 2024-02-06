package solve;

public class Q06_un {

	public static void main(String[] args) {

		int mul = 0;
		int sum = 0;

		for (int i = 77; i >= 1; i--) {
			for (int j = 1; j <= 77; j++) {
				mul = i * j;
				System.out.println(mul);
			}
			
		}
		
		System.out.println(sum);

	}

}
