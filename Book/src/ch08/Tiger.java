package ch08;

public class Tiger extends P219 {
	
	Tiger(String type, String name){
		super(type, name);
	}
	
	void sleep() {
		System.out.println(this.name +"은(는) 산속에서 잠을 잔다.");
	}

}
