package ch12;

public class P287EqualsEx2 {
	
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		if(str1 == str2) {
			System.out.println("str1 ��ü�� str2 ��ü�� ����");
		}else {
			System.out.println("str1 ��ü�� str2 ��ü�� �ٸ�");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 ���ڿ��� str2 ���ڿ��� ����");
		}else {
			System.out.println("str1 ���ڿ��� str2 ���ڿ��� �ٸ�");
		}
	}

}
