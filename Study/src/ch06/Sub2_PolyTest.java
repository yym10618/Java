package ch06;
/*
 * ��¥ : 2022/01/05
 * �̸� : ����
 * ���� : �ڹ� ������ �ǽ��ϱ� ���� p205
 * 
 * ������(Polymorphism)
 *  - �ϳ��� ����� ���� ������� ���ϴ� ����
 *  - ��Ӱ��迡�� �θ�Ŭ������ ����� �ڽ�Ŭ�������� �ٽ� �������ϴ� ���
 *  - ��ü�� Ÿ���� �θ�Ŭ���� Ÿ�� ���� -> ���α׷��� �������� ���δ�.
 */

public class Sub2_PolyTest {
	
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		Animal lion = new Lion();
		Animal shark = new Shark();
		
		eagle.move();
		lion.move();
		shark.move();
		
		eagle.hunt();
		lion.hunt();
		shark.hunt();
	}

}
