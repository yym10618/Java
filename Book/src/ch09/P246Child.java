package ch09;

public class P246Child extends P246Parent implements P245MyInterface1, P245MyInterface2{

	@Override
	public void defaultMethod() {
		System.out.println("Child Ŭ������ default �޼���");
		P245MyInterface1.super.defaultMethod();
		P245MyInterface2.super.defaultMethod();
	}

}
