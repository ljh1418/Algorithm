package test20210807;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		
		//알림시간 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); //5
		int M = sc.nextInt(); //44
		
		sc.close();
		
		//44
		if(M < 45) {
			//5 > 4 
			H--;
			//	60 - (45 - 44) = 59
			M = 60 - (45 - M);
			
			// 0시 45보다 작을시 시간에 -1을 하기 때문에 숫자가 -가 되는것을 방지
			if(H < 0) {
				System.out.println("-방지");
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H+" " +(M - 45));
		}
		
	}
}
