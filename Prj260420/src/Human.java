class Student extends Human{
	String dept;
	int year;
	
	public Student() {
		
	}
	public Student(String name, int age) {
		super.name = name;
		super.age = age;
	}
	public Student(String name, int age, String dept, int year) {
		super.name = name;
		super.age = age;
		this.dept = dept;
		this.year = year;
	}
	void showStudent() {
		super.show();
		System.out.println("학과 : " + dept );
		System.out.println("학년 : " + year + "\n" );
	}
}

public class Human {
	String name;
	int age;
	
	public Human(){
		name = null;
		age = 0;
	}
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age );
	}
	
	public static void main(String[] args) {
		// 1. 객체생성
		Human h1 = new Human();
		h1.show();
		Human h2 = new Human("김철수", 88);
		h2.show();
		// 2. 멤버 접근 : 필요한 일
		h2.name = "황기태";
		h2.age = 123;
		h2.show();
		Student s1 = new Student();
		s1.showStudent();
		Student s2 = new Student("아무개", 2);
		s2.showStudent();
		Student s3 = new Student("김모씨", 25, "컴공", 3);
		s3.showStudent();
	}

}
