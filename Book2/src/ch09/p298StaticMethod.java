package ch09;

class F{
	void abc() {
		System.out.println("instance �޼���");
	}
	static void bcd() {
		System.out.println("static �޼���");
	}
}

public class p298StaticMethod {
	public static void main(String[] args) {
		
		F f1 = new F();
		f1.abc();
		
		F.bcd();
		
		F f2 = new F();
		f2.bcd();
	}

}
