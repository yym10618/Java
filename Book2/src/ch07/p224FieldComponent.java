package ch07;

// Ŭ���� ����
class A{
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3); // work2()�ȿ� ���ǵ� ���� ������ ���� �޸𸮿� �߰�
	}
	void work2 (int i){ // �μ��� ���� i�� ������ �Է¸Ű������� Ȱ��
		int j = 4;
		System.out.println(i + j);
	}
}
public class p224FieldComponent {
	public static void main(String[] args) {
		// Ŭ������ ��ü ����
		A a = new A();
		// �ʵ尪 ���
		System.out.println(a.m);
		System.out.println(a.n);
		// �޼��� ȣ��
		a.work1();
	}

}
