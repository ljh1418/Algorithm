package test20210806;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		
		//a >= b >>> a 가 b 보다 크거나 같다 
		// a > b >>> a 가 b 보다 크다
//		if(a >= 90) {
//			System.out.println("A");
//		}else if(a >= 80) {
//			System.out.println("B");
//		}else if(a >= 70) {
//			System.out.println("C");
//		}else if(a >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
		
		System.out.println((a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F");
	}
}
