package ch07;

public class p242MethodOverloading {
	public static void main(String[] args) {
		print();
		print(3);
		print(5.8);
		print(2, 5);
	}
	
	public static void print() {
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double a) {
		System.out.println(a);
	}
	/* double a �� �ߺ����� ���� �Ұ���
	public static void print(double b) {
		System.out.println(b);
	}
	*/
	public static void print(int a, int b) {
		System.out.println("a : "+a+" b : "+b);
	}
	/* void print(int a, int b)�� �ߺ����� ���� �Ұ���
	public static int print(int a, int b) {
		System.out.println("a: "+a, "b: "+b);
		return a + b;
	}
	*/
}
