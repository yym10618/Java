package ch07;

class D{
	int m;
	void work() {
		System.out.println(m);
	}
	// 컴파일러가 자동으로 기본 생성자 추가
}
class E{
	int m;
	void work() {
		System.out.println(m);
	}
	E(){ // 기본 생성자를 직접 정의
		
	}
}
class F{
	int m;
	void work() {
		System.out.println(m);
	}
	F(int a){   // 입력매개변수를 포함하고 있는 생성자 정의
		m = a;  // 입력매개변수로 전달된 값으로 필드 초기화
	}
}

public class p249DefaultConstructor {
	public static void main(String[] args) {
		
		D d = new D();
		E e = new E();
		F f = new F(3);
		
		d.work();
		e.work();
		f.work();
	}

}
