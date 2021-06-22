package test20210622;

import java.util.Scanner;

public class Code9 {
	
	//배열 순서 바꾸기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열에 넣을값 입력 !");
		int n = sc.nextInt();
		
		// ex)5
		int [] data = new int[n];
		
		// ex)2 1 3 4 5
		for(int i=0; i<n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		// ex)n = 5
		//마지막 배열 tmp 에 저장
		int tmp = data[n-1];
		// ex)i = 3
		for(int i=n-2; i>=0; i--){
			data[i+1] = data[i];
		}
		//첫번째 배열에 tmp 값 넣기
		data[0] = tmp;
		
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}
}
