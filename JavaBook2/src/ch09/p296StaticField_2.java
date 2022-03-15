package ch09;

class E{
	int m = 3;
	static int n = 5;
}

public class p296StaticField_2 {
	public static void main(String[] args) {
		
		E e1 = new E();
		E e2 = new E();
		
		e1.m = 5;
		e2.m = 6;
		System.out.println(e1.m);
		System.out.println(e2.m);
		
		e1.n = 7;
		e2.n = 8;
		System.out.println(e1.n);
		System.out.println(e2.n);
		
		E.n = 9;
		System.out.println(e1.n);
		System.out.println(e2.n);
	}

}
