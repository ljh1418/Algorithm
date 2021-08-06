package test20210806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class test3 {
	public static void main(String[] args) throws IOException {
		
//		//윤년 = 연도가 4의 배수 or 400의 배수 이면서 100의 배수가 아닐때 
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt();
//		
//		sc.close();
//		
//		//가장먼저 4의 배수이여야 하기 때문에 if 문 입력
//		if(a%4 == 0) {
//			//400 의 배수 일 경우
//			if(a % 400 == 0) 
//				System.out.println("400의배수 : 1");
//			//100의배수 걸르는곳
//			else if(a % 100 == 0) 
//				System.out.println("100의배수 : 0");
//			else 
//				System.out.println("ㅇㅇ 1");
//			}
//		//1992
//		else System.out.println("4의배수가 아님 = 0");
		
		//윤년 1 , 아니면 0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		
		if(a % 4 ==0) {
			if(a % 100 !=0 || a % 400 == 0) {
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}else {
			System.out.println("4의배수도 아닌 것 : 0");
		}
		
		
	}
}
