package test3;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : �ڹ� Ŭ���� ��� ��������
 */
class Rent{
	public void payment() {
		System.out.println("�Ӵ�Ḧ �޽��ϴ�.");
	}
}

class Landload extends Rent{
	public void getMoney() {
		System.out.println("�ǹ��� �Դϴ�.");
		payment();
	}
}

public class Ex06 {
	
	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
	}

}
