package test20210608;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("1 부터 n 까지의 합");
		
		do {
			System.out.println("n의값");
			n = sc.nextInt();
		} while ( n <= 0);
		
		//합
		int sum = 0;
		
		for(int i=1; i <= n; i++) {
			sum += i; //sum에 i를 더함
			
			System.out.println("1부터" + n + " 까지의 합은 " + sum + "입니다.");
		}
		
	}

}
