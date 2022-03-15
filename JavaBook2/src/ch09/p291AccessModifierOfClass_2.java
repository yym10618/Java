package ch09;

import ch09_2.AAA;
//import ch09_2.BBB; // public이 아니라 불가능
import ch09_2.CCC;

public class p291AccessModifierOfClass_2 {
	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		//BBB bbb = new BBB(); // 임포트 할 수 없으므로 객체 선언과 생성자 호출 모두 불가능
		//CCC ccc = new CCC(); // default 생성자이므로 호출 불가능
	}

}
