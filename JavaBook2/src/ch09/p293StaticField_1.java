package ch09;

class D{
	int m = 3;
	static int n = 5;
}
public class p293StaticField_1 {
	public static void main(String[] args) {
		
		D d1 = new D();
		System.out.println(d1.m);
		
		System.out.println(D.n);
		
		D d2 = new D();
		System.out.println(d2.n);
	}

}
