package ch09;

public class P244InstanceofEx {
	
	public static void main(String[] args) {
		
		P243A   a   = new P243AAA();
		P243AA  aa  = new P243AAA();
		P243AAA aaa = new P243AAA();
		
		P243A   b   = new P244ABB();
		P243AB  ab  = new P244ABB();
		P244ABB abb = new P244ABB();
		
		System.out.println("a > A : "+ (a instanceof P243A));
		System.out.println("aa > A : "+ (aa instanceof P243A));
		System.out.println("aaa > A : "+ (aaa instanceof P243A));
		System.out.println("aaa > AB : "+ (aaa instanceof P243AB));
	}

}
