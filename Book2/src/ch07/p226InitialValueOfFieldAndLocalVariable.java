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
		System.out.println(m4); // �ʵ�� �ʱ�ȭ���� �ʾƵ� ���� ���� �ʱ�ȭ��
	}
	void printLocalVariable() {
		int k;
		//System.out.println(k); // ���������� �ʱ�ȭ���� ������ ����
	}
}
public class p226InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		B b = new B();
		b.printFieldValue();
	}

}
