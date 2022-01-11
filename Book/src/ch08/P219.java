package ch08;

public class P219 {// Animal
	
	String type;
	String name;
	
	P219(String type, String name){
		this.type = type;
		this.name = name;
	}
	
	void sleep() {
		System.out.println(this.name+"은(는) 잠을 잔다.");
	}

}
