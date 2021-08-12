package test20210813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NPrint {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		int N = Integer.parseInt(st.nextToken());
//		
//		int i=1;
//		while(i<=N) {
//			System.out.println(i);
//			i++;
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		
		while(i <= N) {
			sb.append(i+"\n");
			i++;
		}
		System.out.println(sb);
	}
}
