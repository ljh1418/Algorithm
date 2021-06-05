package test20210605;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Student s1 = new Student("손오공","1111");
		Student s2 = new Student("홍길동","2222");
		Student s3 = new Student("손흥민","3333");
		
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		
//		for(Student stu : list) {
//			System.out.println(stu.getName());
//			System.out.println(stu.getNo());
//		}
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색을 하고 싶으면 y , 종료하고싶으면 n");
			//입력을받음
			String input = scan.next();
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 : " + stu.getNo());
						flag = true;
					}
				}
				
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
				
				
			}else if(input.equals("n")){
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
	}
}
