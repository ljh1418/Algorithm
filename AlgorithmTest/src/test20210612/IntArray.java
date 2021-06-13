package test20210612;

public class IntArray {

	public static void main(String[] args) {
		//배열선언
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2; // 37 * 2 = 74
		
		for(int i=0; i<a.length; i++)
			// i=0 >> a[0]에 값을 주지 않았기 때문에 0 의 값을 출력
			System.out.println("a["+ i + "] = " + a[i]);
		//
		System.out.println("=========================");
		//
		int[] b = {1,2,3,4,5};
		
		for(int i=0; i<b.length; i++)
			System.out.println("b["+i+"] = " + b[i]);
		
	}

}
