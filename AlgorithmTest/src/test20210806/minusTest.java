package test20210806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class minusTest {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//double aa = Double.parseDouble(st.nextToken());
		//double bb = Double.parseDouble(st.nextToken());
		
//		System.out.println(a + b);
//		
//		System.out.println(a - b);
//		
//		System.out.println(a * b);
//
//		System.out.println(a / b);
//		
//		// 연산자 % = 나누기한 값의 나머지 값을 반환
//		System.out.println(a % b);
		
		// 17 % 5 = 2 >>>>
		
		
		System.out.println((a + b) % c);
		// >> ( a mod c + b mod c) mod c
		// >> ( a % c + b % c ) % c
		System.out.println((a % c) + (b % c) % c);
		System.out.println((a*b) % c);
		System.out.println((a % c) * (b % c) % c);
		
	}
}
