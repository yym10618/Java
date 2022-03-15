package ch10;

class I{
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}
class J extends I{
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class p325Typecasting_2 {
	public static void main(String[] args) {
		
		I ii = new I();
		System.out.println(ii.m);
		ii.abc();
		
		J jj = new J();
		System.out.println(jj.m);
		System.out.println(jj.n);
		jj.abc();
		jj.bcd();
	}

}
