package ch07;

class C{
	void print() {
		System.out.println("�ȳ�");
	}
	int data() {
		return 3;
	}
	double sum(int a, double b) {
		return a + b;
	}
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("�߸��� �Է�");
			return;
		}
		System.out.println(m + "���Դϴ�.");
	}
}
public class p231ExternalCallMethods {
	public static void main(String[] args) {
		C c = new C();
		c.print();
		int k = c.data();
		c.data();
		System.out.println(k);
		double result = c.sum(3, 5.2);
		System.out.println(result);
		c.printMonth(5);
		c.printMonth(15);
	}

}
