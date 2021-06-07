package test20210606;

public class ForSum {
	public static void main(String[] args) {
		
		//합계를 담을 변수
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1 부터 10 까지의 합은 " + sum + "입니다.");
	}
}
