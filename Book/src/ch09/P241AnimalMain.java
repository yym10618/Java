package ch09;

public class P241AnimalMain {
	
	public static void main(String[] args) {
		
		P240Animal eagle = new P241Eagle();
		
		eagle.sleep();
//		eagle.eat(); // 에러
		
		P241Eagle eagleObj = (P241Eagle)eagle; // 강제 형변환
		eagleObj.eat(); // Eagle 클래스의 eat() 메서드
	}

}
