package ch04;

public class p61 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// AND연산
	    System.out.println(a > b && a == 10);
	    System.out.println(a > b && a == b);
	    
	    // OR연산
	    System.out.println(a > b || a == b);
	    System.out.println(a < b || a == b);
	    
	    // XOR연산
	    System.out.println(a > b ^ a == 10);
	    System.out.println(a > b ^ a == b);
	    
	    // NOT연산
	    System.out.println(!(a > b));
	    System.out.println(!(a < b));
	}
}
