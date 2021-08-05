package test20210805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class iftest3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// readLine >>> 한줄씩 읽기 , 라인단위로 입력받기
		
		//주의 !! >>> readLine 이 있기때문에 A값 과 B값을 전부 입력 단 조건 " " 뛰어쓰기 존재해야함 >>> 1치고 엔터치면 에러발생
		//ex) 1 2 >>> 한줄에서 처리
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		
		//스트링형 이라서 형변환 필수
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		
		
		System.out.println((A > B) ? ">" : ((A < B) ? "<" : "==" ));
	}
}
