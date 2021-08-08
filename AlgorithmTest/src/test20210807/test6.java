package test20210807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test6 {
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int a = sc.nextInt();
//		sc.close();
//		
//		int sum = 0;
//		
//		for(int i=1; i<=a; i++) {
//			
//			//sum = sum+i;
//			sum += i;
//			
//		}
//		System.out.println(sum);

	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st = new StringTokenizer(br.readLine()," ");
	
	int a = Integer.parseInt(st.nextToken());
	
	int sum = 0;
	
	for(int i=1; i<=a; i++) {
		sum += i;
	}
	System.out.println(sum);
	
	}
}