package test20210616;

import java.util.Scanner;

//최빈수 구하기
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 10번 입력해주세요.");
		int[] inputNum = new int[10];
		for (int i=0; i<10; i++) {
			inputNum[i] = sc.nextInt();
		}
		
		//입력 값 ex) 1 2 2 3 1 4 2 2 4 3
		// 1 : 2
		// 2 : 4 >>> 최빈수
		// 3 : 2
		// 4 : 2
		
		int[] mode = new int [10];
		
		// index >>> 출현한 수
		// index 값 >>> index(출현한수)가 몇번나왔는지 저장하는 용도
		
		//				 0 1 2 3 4 5 6 7 8 9	
		// inputNum >>>  1 2 2 3 1 4 2 2 4 3
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		// mode[1] == 2
		// mode[2] == 4
		// mode[3] == 2
		// mode[4] == 2
		
		int modeNum = 0; //최빈수
		int modeCnt = 0; //최빈수가 나온횟수
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 : " + modeNum);
		System.out.println("최빈수 횟수 : " + modeCnt);
	}
}
