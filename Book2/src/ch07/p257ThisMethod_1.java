package ch07;

class K{
	K(){
		System.out.println("ù ��° ������");
	}
	K(int a){
		this();
		System.out.println("�� ��° ������");
	}
}

public class p257ThisMethod_1 {
	public static void main(String[] args) {
		
		K k1 = new K();
		System.out.println();
		K k2 = new K(3);
	}

}
