package ch11;

public class P271ExceptionEx3 {
	
	public static void main(String[] args) {
		System.out.println("DB���� ����");
		try {
			System.out.println("DB�۾�");
		}catch(Exception e) {
			System.out.println("DB�۾� �� ���ܹ߻�");
		}finally {
			System.out.println("DB���� ����");
		}
	}

}
