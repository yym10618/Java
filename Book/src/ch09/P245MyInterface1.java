package ch09;

public interface P245MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MyInterface1 �� default �޼���");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface1 �� static �޼���");
	}

}
