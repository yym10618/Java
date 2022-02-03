package ch08;

class A{
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m+", "+n);
	}
}
public class p276ExternalClass_1 {
	public static void main(String[] args) {
		
		A a = new A();
		a.print();
	}

}
