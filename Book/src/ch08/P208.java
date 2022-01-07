package ch08;

public class P208 {

	public static void main(String[] args) {
		
		P206 p = new P207();
		
		p.run();
		
		// 자식클래스의 자료형으로 변환(강제형변환)
		P207 c = (P207)p;
		c.eat();
		
	}
}
