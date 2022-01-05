package ch08;

public class PolyEx { //PolyEx
	
	public static void main(String[] args) {
		
		P207/*Child*/ c = new P207/*Child*/();
		
		c.run();
		
		// 부모클래스의 자료형으로 선언(자동형변환)
		P206/*Parent*/ p = new P207/*Child*/();
		p.run(); // 재정의된 메서드가 실행
		// p.eat(); // 에러
	}

}
