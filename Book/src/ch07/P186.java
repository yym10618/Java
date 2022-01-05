package ch07;

class Singleton {
	
	// static ����
	private static Singleton instance = new Singleton();
	
	// �����ڿ� private ���� ������
	private Singleton() {
		System.out.println("��ü ����");
		
	}
	
	// static �޼���
	public static Singleton getInstatnce() {
		System.out.println("��ü ����");
		return instance;
	}

}

public class P186{ //SingletonMain
	
	public static void main(String[] args) {
		
		//Singleton s = new Singleton(); // �����߻�
		
		Singleton s1 = Singleton.getInstatnce();
		Singleton s2 = Singleton.getInstatnce();
		Singleton s3 = Singleton.getInstatnce();
	}
	
}