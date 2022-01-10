package ch08;

abstract class Shape { //Shape
	String type;
	Shape(String type){
		this.type = type;
	}
	abstract double area();
	abstract double length();
}

class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r = r;
	}
	double area() {
		return r * r * Math.PI;
	}
	double length() {
		return 2 * r * Math.PI;
	}
	public String toString() {
		return "Shape[type =" + type + ", r = "+ r + "]";
	}
}

class Rectangle extends Shape{
	int width, height;
	Rectangle(int width, int height){
		super("사각형");
		this.width = width;
		this.height = height;
	}
	double area() {
		return width * height;
	}
	double length() {
		return 2 * (width + height);
	}
	public String toString() {
		return "Shape [type = " + type +", width = " + width + ", height = " + height +"]";
	}
}

public class P216{
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(10);
		shapes[1] = new Rectangle(5, 5);
		for (Shape s : shapes) {
			System.out.println(s);
			System.out.println("넓이 : "+s.area()+ " 둘레 : "+s.length());
		}
	}
}
