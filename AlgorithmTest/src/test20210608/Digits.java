package test20210608;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no = 0;
		
		System.out.println("2자리의 정수를 입력하세요");
	
		do {
			System.out.print("입력 : ");
			no = sc.nextInt();
			System.out.println("2 자리 이상 입력해주세요 !!!");
		}while (no < 10 || no > 99); // =  (!(no >= 10 && <=99))
		
		
		System.out.println("변수 no 의 값은" + no + "입니다.");
	}
}
