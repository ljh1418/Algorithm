package test20210806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) throws IOException {
		
		//방법1
//		Scanner sc = new Scanner(System.in);
//		
//		int a = sc.nextInt(); //472
//		String b = sc.next(); //385
//		
//		sc.close();
//		
//		 //'0' 사용해야지 문자가 아닌 숫자로 인식해서 값을 나타냄
//		System.out.println(a * (b.charAt(2) - '0'));
//		System.out.println(a * (b.charAt(1) - '0'));
//		System.out.println(a * (b.charAt(0) - '0'));
//		System.out.println(a * Integer.parseInt(b));
		
//		String num = "345";
//		int result = num.charAt(0);
//		//문자의 3으로 인식
//		System.out.println(result);
		
		//방법2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(a * (b%10));
		sb.append('\n');
		
		sb.append(a * (b%100)/10);
		sb.append('\n');
		
		sb.append(a * (b/100));
		sb.append('\n');
		
		sb.append(a * b);
		
		System.out.println(sb);
		
	}
}
