package ch08;

public class Lion extends P219 {
	
	Lion(String type, String name){
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name+"은(는) 숲속에서 잠을 잔다.");
	}

}
