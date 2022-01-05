package ch07;

class Student2 {
	
	//필드
	String name; // 학생명
	int grade; // 학년
	String department; // 학과
	
	// 1번 생성자
	Student2(){
		
	}
	
	// 2번 생성자
	Student2(String n){
		name = n;
	}

	// 3번 생성자
	Student2(String n, int g){
		name = n;
		grade = g;
	}
	
	// 4번 생성자
	Student2(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}

public class P170{
	
	public static void main(String[] args) {
		
		Student2 stu1 = new Student2("홍길동", 4, "소프트웨어공학");
		
		System.out.println(stu1.name);
		System.out.println(stu1.grade);
		System.out.println(stu1.department);
		
		Student2 stu2 = new Student2("이순신", 3, "디자인");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// 기본 생성자로 객체 생성
		Student2 stu0 = new Student2();
		
	}
}
