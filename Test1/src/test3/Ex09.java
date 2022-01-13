package test3;

/*
 * 날짜 : 2022/01/12
 * 이름 : 양용민
 * 내용 : 자바 추상클래스, 다형성 연습문제
 */
abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Triangle");
	}
}

class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("draw Circle");
	}
}

public class Ex09 {
	
	public static void main(String[] args) {
		
		Ex09 here = new Ex09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(Shape obj) {
		obj.draw();
		
	}

}
