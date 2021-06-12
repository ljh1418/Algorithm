package test20210612;

public class Multi99Table {
	public static void main(String[] args) {
		System.out.println("---곱셉표---");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) 
				//%3d = 3자리 보다 작으면 왼쪽에 맞춰서 출력
				System.out.printf("%3d", i * j);
			System.out.println();
				
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++)
			System.out.printf("%3d" , i * j);
			System.out.println();
		}
	}
}
