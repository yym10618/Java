package ch07;

class G{
	G(){
		System.out.println("ù ��° ������");
	}
	G(int a){
		System.out.println("�� ��° ������");
	}
	G(int a, int b){
		System.out.println("�� ��° ������");
	}
}

public class p251ConstructorOverloading {
	public static void main(String[] args) {
		
		G g1 = new G();
		G g2 = new G(3);
		G g3 = new G(3, 5);
	}

}
