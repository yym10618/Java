package ch08;

public class P221 {// Animal main
	
	public static void main(String[] args) {
		
		P219[] ani = new P219[4];
		
		P219 eagle = new Eagle("조류", "독수리");
		P219 tiger = new Tiger("포유류", "호랑이");
		P219 lion = new Lion("포유류", "사자");
		P219 shark = new Shark("어류", "상어");
		
		ani[0] = eagle;
		ani[1] = tiger;
		ani[2] = lion;
		ani[3] = shark;
		
		for(int i=0 ; i<ani.length ; i++) {
			ani[i].sleep();
		}
	}

}
