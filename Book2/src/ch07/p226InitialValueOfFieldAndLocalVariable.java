package ch07;

class B{
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4); // 필드는 초기화하지 않아도 값이 강제 초기화됨
	}
	void printLocalVariable() {
		int k;
		//System.out.println(k); // 지역변수는 초기화하지 않으면 오류
	}
}
public class p226InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		B b = new B();
		b.printFieldValue();
	}

}
