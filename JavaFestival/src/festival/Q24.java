package festival;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N 입력 >>");
		int n = sc.nextInt();
		System.out.println();
		System.out.print("X 입력 >>");
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(i+"번째 정수 입력>> ");
			int[] array = new int[i]; 
			array[i] = sc.nextInt();
			int[] arraySave=new int[i];
			if(array[i]<x) {
				array[i]
			}
			
		}
		
		
		
		
	}

}
