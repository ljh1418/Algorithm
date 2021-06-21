package test20210621;

import java.util.Scanner;

public class Code5 {
	public static void main(String[] args) {
		// 입력값 받기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int[n];
		for(int i=0; i<n; i++) 
			data[i] = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int max = data[0];
		// int max = 0; >>> 가장큰값이 0이 되므로 -값 받지 못함
		for (int i=0; i<n; i++) {
			sum += data[i]; // 
			// 최대값
			if(data[i] > max)
				max = data[i];
		}
		
		System.out.println("Sum : " + sum);
		System.out.println("Max : " + max);
		
		
	}
}
