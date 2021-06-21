package test20210621;

public class Code1 {
	// 전역변수 = 메서드 내부에 선언될 수도 있고 외부에 선어될 수도 있다.
	// 하지만 클래스 외부에 선언될수는 없다.
	public static int num;
	
	public static void main(String[] args) {
		// 지역변수 = 메서드 내부에 선언된 변수는 메서드 내에서만 사용 가능 
		int anotherNum = 5;
		num = 2;
		
		System.out.println(num + anotherNum); //7
		System.out.println("num : " + num); //2
		System.out.println("anotherNum : " + anotherNum); //5
		System.out.println("Sum : " + num + anotherNum ); //25
		System.out.println("Sum : " + (num + anotherNum)); //7
	}
}
