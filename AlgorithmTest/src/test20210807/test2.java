package test20210807;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
		// 사분면 고르기
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		// X가 양수일때 >>> 1 or 4
		// X가 양수이면서 Y도 양수이면 1
		// X가 양수이면서 Y는 음수이면 4
		if(X > 0) {
			if(Y > 0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}
		// X가 음수일때 >>> 2 or 3
		// X가 음수이면서 Y는 양수이면 2
		// X가 음수이면서 Y도 음수이면 3
		else {
			if(Y > 0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
		
	}
	
	
}
