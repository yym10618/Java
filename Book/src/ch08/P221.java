package ch08;

public class P221 {// Animal main
	
	public static void main(String[] args) {
		
		P219[] ani = new P219[4];
		
		P219 eagle = new Eagle("����", "������");
		P219 tiger = new Tiger("������", "ȣ����");
		P219 lion = new Lion("������", "����");
		P219 shark = new Shark("���", "���");
		
		ani[0] = eagle;
		ani[1] = tiger;
		ani[2] = lion;
		ani[3] = shark;
		
		for(int i=0 ; i<ani.length ; i++) {
			ani[i].sleep();
		}
	}

}
