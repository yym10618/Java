package ch12;

public class P294PropertyEx {
	
	public static void main(String[] args) {
		
		// �ڹ� ���� 
		System.out.println(System.getProperty("java.version"));
		// JDK ��� 
		System.out.println(System.getProperty("java.home"));
		// OS 
		System.out.println(System.getProperty("os.name"));
		// ���� ������(������, ���н��� /)
		System.out.println(System.getProperty("file.separator"));
		// ����ڸ� 
		System.out.println(System.getProperty("user.name"));
		// ����� Ȩ���丮 
		System.out.println(System.getProperty("user.home"));
		// ���� ��ũ�����̽� ���丮 ��ġ 
		System.out.println(System.getProperty("user.dir"));
	}

}
