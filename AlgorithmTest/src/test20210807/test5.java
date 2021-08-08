package test20210807;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("c입력");
		int c = sc.nextInt();//5
		
		//배열 5 생성
		int arr[] = new int[c];
		
		
		for(int i=0; i<c; i++) {
			System.out.println("a입력");
			int a = sc.nextInt();
			System.out.println("b입력");
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
		
		
		for(int k : arr) {
			System.out.println("k의값" + k);
		}
		
//		int arr2[] = {1,2,3,4,5};
//		
//		for(int number : arr2) {
//			System.out.println(number);
//		}
		
	}
}
