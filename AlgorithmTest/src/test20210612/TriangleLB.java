package test20210612;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		do {
			System.out.println("몇 단 삼각형입니까 ?");
			n = sc.nextInt();
		}while (n <= 0);
		
		// i가1일때 j를1로 증가시키면서 * 를 출력후 줄바꿈
		//
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("1");
			System.out.println();
		}
	}
}
