package festival;

public class SecondB06 {

	public static void main(String[] args) {

		int base = 2;
		int n = 3;
		int result = (int)powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	public static double powerN(double base, double n) {

		double result = Math.pow(base, n);
		return result;
	}

}
