package test20210607;

public class DataSwap {

	public static void main(String[] args) {
		
		int data1 = 10;
		int data2 = 20;
		
		//데이터 교환에 사용할 임시변수
		int temp = 0;
		
		System.out.println("교환전 data1 : " + data1);
		System.out.println("교환전 data2 : " + data2);
		System.out.println("======================");
		
		//data1 = data2 그대로 삽입하면 덮어씌우게 되므로 임시로 값을 담아 둘 temp 변수를 사용한다
		temp = data1;	//temp = 10;
		data1 = data2;	//data1 = 20
		data2 = temp;	//data2 = 10
		
		System.out.println("교환후 data1 : " + data1);
		System.out.println("교환후 data2 : " + data2);
		
		
		
		
	}

}
