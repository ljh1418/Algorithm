package test20210622;

public class Code10 {
	public static void main(String[] args) {
		
		int num = 13;
		
		//소수1 , 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님
		//소수 = 1과 자기자신만 나누어떨어지는경우
		
		boolean isPrimeNumber = true;
		
		// 자기 자신보다 2보다 작으면 실수로 판단 가능
		for(int i=2; i <= num/2; i++) {
			if(num % i == 0) {
				//primeNumber x = prime = 소수(1과 자기 자신뿐인 자연수)
				isPrimeNumber = false;
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(num + "은 소수 입니다.");
		}else{
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}
}
