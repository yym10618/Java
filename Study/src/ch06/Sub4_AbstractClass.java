package ch06;

/*
 * ��¥ : 2022/01/05
 * �̸� : ����
 * ���� : �ڹ� �߻�Ŭ���� �ǽ��ϱ� ���� p216
 */
public class Sub4_AbstractClass {
	
	public static void main(String[] args) {
		
		Unit zealot = new Zealot();
		Unit zerg = new Zerg();
		
		zealot.move();
		zealot.attack();
		
		zerg.move();
		zerg.attack();
	}

}
