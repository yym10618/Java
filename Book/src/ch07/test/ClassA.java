package ch07.test;

public class ClassA {
	
public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.print();
		
	}
	
	public void print() {
		System.out.println("����� ClassA");
		
	}
	
}

class ClassB{
	void print() {
		System.out.println("����� ClassB");
		
	}
}


