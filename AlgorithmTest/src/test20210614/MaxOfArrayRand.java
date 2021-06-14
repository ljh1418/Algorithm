package test20210614;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	
	//메소드
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	//실행
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람의 수 : ");
		
		// sc.nextInt 에서 입력받은 값을 num 에 넣어줌
		int num = sc.nextInt();
		
		// num의 갯수에 따라 배열 생성
		int[] height = new int[num];
		
		System.out.println("키 캆은 아래와 같습니다.");
		for(int i=0; i<num; i++) {
			//radn.nextInt(90) >>> 0~89 사이의 숫자를 출력
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
			
		}

		for(int j=0; j<height.length; j++) {
			System.out.println("받은값" + height[j]);
		}
		
		System.out.println("최대값은" + maxOf(height) + "입니다.");
	}
}
