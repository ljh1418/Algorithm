package test20210807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test7 {
	public static void main(String[] args) throws IOException {
		//덧셈 시간초줄이기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//nextToken 으로 값을 받을때
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			System.out.println("for문 들어옴");
			//한줄 전체를 읽어버림 덧셈을 2개의 수로만 하고 있기 때문에 a + b 더함 a + b + c 가 있어도 a 와 b 만 더함
			st = new StringTokenizer(br.readLine()," "); 
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
		}
		System.out.println("for 문 끝");
		br.close();
		System.out.println(sb);
		
	}
}
