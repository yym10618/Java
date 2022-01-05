package ch07;

public class P171 {
	
	public static void main(String[] args) {
		
		Student3 stu1 = new Student3(); // 1번 생성자
		Student3 stu2 = new Student3("홍길동"); // 2번 생성자
		Student3 stu3 = new Student3("홍길동", 4); // 3번 생성자
		Student3 stu4 = new Student3("홍길동", 4, "소프트웨어공학"); // 4번 생성자
		
	}

}
class Student3{
	
	//필드
		String name; // 학생명
		int grade; // 학년
		String department; // 학과
		
		// 1번 생성자
		Student3(){
			
		}
		
		// 2번 생성자
		Student3(String n){
			name = n;
		}

		// 3번 생성자
		Student3(String n, int g){
			name = n;
			grade = g;
		}
		
		// 4번 생성자
		Student3(String n, int g, String d){
			name = n;
			grade = g;
			department = d;
		}
}
		
		// 학과와 학년을 매개변수로 받는 생성자(에러 발생)
		//Student(String d, int g){
			//department = d;
			//grade = g;
		//}
