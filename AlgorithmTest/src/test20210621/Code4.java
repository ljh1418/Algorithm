package test20210621;

import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {
		
		//입력 받은값 저장
		String name = null;
		int age;
		String gender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 나이 성별(male/female) 입력해주세요!");
		name = sc.next();
		age = sc.nextInt();
		gender = sc.next();
		
		if(gender.equals("male")) {
			System.out.println(name + "," + age + "years old man.");
		}else if(gender.equals("female")){
			System.out.println(name + "," + age + "years old woman.");
		}else {
			System.out.println("무엇....?");
		}
		
		//종료
		sc.close();
	}

}
