package test20210805;

import java.util.Scanner;

public class iftest2 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int A = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		int B = sc.nextInt();
		
		sc.close();
		
		System.out.println("====출력====");
		
		//			     조건문  ?  참일때 : 거짓일때
		String str = (A > B) ? ">" : ((A < B) ? "<" : "==" );
		System.out.println(str);
		
		
		
		
	}
}
