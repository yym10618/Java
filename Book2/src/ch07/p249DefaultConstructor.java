package ch07;

class D{
	int m;
	void work() {
		System.out.println(m);
	}
	// �����Ϸ��� �ڵ����� �⺻ ������ �߰�
}
class E{
	int m;
	void work() {
		System.out.println(m);
	}
	E(){ // �⺻ �����ڸ� ���� ����
		
	}
}
class F{
	int m;
	void work() {
		System.out.println(m);
	}
	F(int a){   // �Է¸Ű������� �����ϰ� �ִ� ������ ����
		m = a;  // �Է¸Ű������� ���޵� ������ �ʵ� �ʱ�ȭ
	}
}

public class p249DefaultConstructor {
	public static void main(String[] args) {
		
		D d = new D();
		E e = new E();
		F f = new F(3);
		
		d.work();
		e.work();
		f.work();
	}

}
