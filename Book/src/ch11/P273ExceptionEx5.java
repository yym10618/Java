package ch11;

public class P273ExceptionEx5 {
	
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		try {
			throw new Exception("���� �߻�");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("���α׷� ����");
	}

}
