package ch09;

class G{
	int a;
	static int b;
	static {
		b = 5;
		System.out.println("Ŭ���� G�� �ε��ƽ��ϴ�!!");
	}
	G(){
		a = 3;
	}
}

public class p301StaticInitialBlock {
	public static void main(String[] args) {
		
		System.out.println(G.b);
	}

}
