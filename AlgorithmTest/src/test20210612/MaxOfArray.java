package test20210612;

import java.util.Scanner;

//메소드
public class MaxOfArray {
	static int maxOf(int[] height) {
		int max = height[0];
		for(int i=0; i<height.length; i++)
			if(height[i] > max)
				max = height[i];
		return max;
	}
	
	//실행
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("height[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		
		// maxOf 매소드 호출 및 배열 height 변수 대입
		System.out.println("최대값은" + maxOf(height) + "입니다.");
		
	}
}
