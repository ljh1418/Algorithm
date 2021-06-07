package test20210606;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		//An = An-1 + An-2; n>=3
		//a1 = 1 , a2 = 1
		
		//초기화
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		// i가 0부터 시작이 아닌 1부터 시작
		for(int i=1; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//2번째 방법
		int prevPrevNum = 1;
		int prevNum = 1;
		
		System.out.print(prevPrevNum + " ");	//1
		System.out.print(prevNum + " ");	//1
		
		for(int i=3; i<=10; i++) {
			int nNum = prevPrevNum + prevNum;
			System.out.print(nNum + " "); //처음값 2 , 
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
	}
}
