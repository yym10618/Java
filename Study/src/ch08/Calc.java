package ch08;

public class Calc {
	
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) throws Exception{// �޼��忡 ����ó��
		
		if(x == 0) {
			Exception e1 = new Exception("x�� 0�̸� �ȵ˴ϴ�...");
			throw e1;
		}
	
		if(y < 0) {
			Exception e2 = new Exception("y�� �����̸� �ȵ˴ϴ�...");
			throw e2;	
		}
		
		
		int z = x / y;
		
		return z;
	}

}
