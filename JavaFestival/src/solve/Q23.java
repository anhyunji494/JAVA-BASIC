package solve;

public class Q23 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int n = array.length;
		int m = array[0].length;
		int[][] temp = new int[m][n];
		int[][] temp1 = new int[m][n];
		int[][] temp2 = new int[m][n];

		int count = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = count;
				count++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				temp[i][j] = array[n - 1 - j][i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				temp1[i][j] = temp[n - 1 - j][i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				temp2[i][j] = temp[n - 1 - j][i];
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(temp2[i][j] + " ");
			}
		}
		System.out.println();

	}

}
