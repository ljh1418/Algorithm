package test20210805;

import java.util.Scanner;

public class iftest {
	public static void main(String[] args) {
		
		//방법1
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
				
		scanner.close();
		
		System.out.println("======출력======");
		
		if(A > B) {
			System.out.println(">");
		}else if(A < B){
			System.out.println("<");
		}else if(A == B){ // int 형이기 때문에 == 사용 OK , String 형 일때는 equals 사용하기
			System.out.println("=");
		}else{
			System.out.println("숫자만입력해주세요");
		}
			
		
	}
}
