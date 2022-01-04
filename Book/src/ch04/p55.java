package ch04;

public class p55 {

	public static void main(String[] args) {
		
		// 10 / 4 = ?
		
		int a = 10;
		int b = 4;
		
		System.out.println("10 / 4 = "+a / b); // 변수를 정수로 선언했기때문에 결과값도 정수형태
		
		double c = 10;
		int d = 4;
		System.out.println("10 / 4 = "+c / d); // 변수 둘중 하나 이상이 실수형태일 경우 결과값도 실수형태
		
		//강제 형변환
		int e = 10;
		int f = 4;
		System.out.println("10 / 4 = "+ (double)e / f);
		
	}
}
