package ch12;

public class P290ToStringEx {
	
	public static void main(String[] args) {
		
		Fruit f = new Fruit("»ç°ú", "»¡°­");
		System.out.println(f);
	}

}

class Fruit{
	String name;
	String color;
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
}