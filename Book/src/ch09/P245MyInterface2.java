package ch09;

public interface P245MyInterface2 {
	
	default void defaultMethod() {
		System.out.println("MyInterface2 �� default �޼���");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2 �� static �޼���");
	}

}
