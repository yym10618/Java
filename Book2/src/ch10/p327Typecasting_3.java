package ch10;

class K{}
class L extends K{}

public class p327Typecasting_3 {
	public static void main(String[] args) {
		
		K kk = new K();
		K kl = new L();
		
		System.out.println(kk instanceof K);
		System.out.println(kl instanceof K);
		
		System.out.println(kk instanceof L);
		System.out.println(kl instanceof L);
		
		if(kk instanceof L) {
			L l = (L) kk;
			System.out.println("kk�� L�� ĳ�����߽��ϴ�.");
		}else {
			System.out.println("kk�� LŸ������ ĳ������ �Ұ���!!!");
		}
		if(kl instanceof L) {
			L l = (L) kl;
			System.out.println("kl�� L�� ĳ�����߽��ϴ�.");
		}else {
			System.out.println("kl�� LŸ������ ĳ������ �Ұ���!!!");
		}
		if("�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� String Ŭ�����Դϴ�.");
		}
	}

}
