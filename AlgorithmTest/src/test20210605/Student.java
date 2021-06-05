package test20210605;

//학생정보를 저장하고 학생이름으로 검색시 학번출력
public class Student {

	private String name;
	private String no;
	
	
	//생성자
	public Student(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}
