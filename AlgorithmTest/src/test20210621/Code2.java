package test20210621;

import java.util.Scanner;

public class Code2 {
	public static void main(String[] args) {
		int number = 123;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 123을 입력해주세요.");
		
		// int 형 입력 >>> nextInt();
		int input = sc.nextInt();
		
		if(input == number) {
			System.out.println("일치합니다.");
		}else {
			System.out.println("불일치합니다.");
		}
	}
}
