package ch10;

class M{
	void print() {
		System.out.println("M 클래스");
	}
}
class N extends M{
	@Override
	void print() {
		System.out.println("N 클래스");
	}
}

public class p332MethodOverriding_1 {
	public static void main(String[] args) {
		
		M mm = new M();
		mm.print();
		
		N nn = new N();
		nn.print();
		
		M mn = new N();
		mn.print();
	}

}
