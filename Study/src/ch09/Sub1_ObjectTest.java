package ch09;
/*
 * ��¥ : 2022/01/10
 * �̸� : ����
 * ���� : �ڹ� Object ����Ŭ���� �ǽ��ϱ� ���� p284
 */
public class Sub1_ObjectTest {
	
	public static void main(String[] args) {
		
		// �ڹ��� �ֻ��� Ŭ���� Object�� ��ĳ����(������)
		Object  apple  = new Apple("�ѱ�", 5000);
		Object banana = new Banana("�Ϻ�", 3000);
		
		apple.toString();
		banana.toString();
	}

}
