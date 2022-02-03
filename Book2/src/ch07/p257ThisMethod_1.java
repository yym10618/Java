package ch07;

class K{
	K(){
		System.out.println("첫 번째 생성자");
	}
	K(int a){
		this();
		System.out.println("두 번째 생성자");
	}
}

public class p257ThisMethod_1 {
	public static void main(String[] args) {
		
		K k1 = new K();
		System.out.println();
		K k2 = new K(3);
	}

}
