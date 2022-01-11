package ch08;

public class Eagle extends P219 {
	
	Eagle(String type, String name){
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name+"은(는) 하늘에서 잠을 잔다.");
	}

}
