package ch09;

public interface P245MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MyInterface1 의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface1 의 static 메서드");
	}

}
