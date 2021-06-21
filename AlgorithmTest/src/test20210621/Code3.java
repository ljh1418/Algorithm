package test20210621;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		String str = "Hello";
		
		// input에 값을 저장
		String input = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello를 입력해주세요.");
		
		// String 형 입력 >>> next();
		input = sc.next();
		
		//스트링형 비교 할때는 반드시 equals 사용 !!!
		if(str.equals(input)) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
	}

}
