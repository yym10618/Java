package ch10;

class Animal{
	void cry() {}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("±±");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("�߿�");
	}
}
class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("�۸�");
	}
}

public class p335MethodOverriding_2 {
	public static void main(String[] args) {
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		Animal[] animals = {ab, ac, ad};
		for(Animal animal : animals) {
			animal.cry();
		}
	}

}
