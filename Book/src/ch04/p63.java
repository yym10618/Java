package ch04;

public class p63 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// &����
		System.out.println(a == b & test());
		
		// &&����
		System.out.println(a == b && test());
	}
	
	public static boolean test() {
		System.out.println("test()�޼��� �����");
		return true;
	}

}
