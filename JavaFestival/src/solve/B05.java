package solve;

import java.util.Scanner;

public class B05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 수 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}

		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			idx = i;
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[j] > arr[idx]) {
					idx = j;
				}
			}
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}

//		확인용: 배열 출력 
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}

		System.out.println("정렬 후");
		
		for(int i : arr) {
			System.out.print(i+"\t");
		}
		
	}

}
