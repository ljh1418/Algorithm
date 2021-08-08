package test20210807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//사분면 고르기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		if(X > 0) {
			if(Y > 0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(Y > 0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
		
	}
}
