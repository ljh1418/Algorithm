package test20210606;

public class Max3m {
	
	public static void main(String[] args) {
		
		int max = 0;
		int min = Integer.MAX_VALUE; // 정수형 데이터 중 가장 큰값으로 초기화
		
		int[] data = {1,2,3,4,5};
		
		for(int i=0; i<data.length; i++) {
			
			//최대값
			if(data[i] > max) {
				max = data[i];
			}
			
			if(data[i] < min) {
				min = data[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
}
