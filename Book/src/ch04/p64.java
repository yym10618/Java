package ch04;

public class p64 {
	
	public static void main(String[] args) {
		
	/*	int a = 10;
		int b = 0;
		
		// & 연산
		System.out.println(b > 0 & (a / b > 0));
	}

}*/   // 10 을 0으로 나누는 에러가 발생 & -> && 로 
		
		int a = 10;
		int b = 0;
		
		// & 연산
		System.out.println(b > 0 && (a / b > 0));
	}
	
}
