package solve;

public class Q21_1 {

	public static void main(String[] args) {
//		1. 인덱스는 0부터 시작한다
//		2. 각각의 거리를 전부 비교해야 한다. 
//		3. 거리가 가장 적은 경우, 그때 값을 통해 최솟값이 결정되고, 그때 인덱스 값을 저장해야 한다. 

		int[] point = { 92, 32, 52, 9, 82, 2, 68 };
		int min = Math.abs(point[0] - point[2]);
		// Math.abs = > 절댓값을 반환함
		int length = 0;
		int[] arr = new int[2];
		for (int i = 0; i < point.length; i++) {
			// if(i==point.length-1)
			// break;
			for (int j = i + 1; j < point.length; j++) {
				length = point[i] - point[j];
				length = Math.abs(length);

				if (length < min) {
					min = length;
					arr[0] = i;
					arr[1] = j;

				}
			}
		}

		System.out.printf("result=[%d, %d]", arr[0], arr[1]);

	}

}
