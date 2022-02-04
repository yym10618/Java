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
			System.out.println("kk를 L로 캐스팅했습니다.");
		}else {
			System.out.println("kk는 L타입으로 캐스팅이 불가능!!!");
		}
		if(kl instanceof L) {
			L l = (L) kl;
			System.out.println("kl을 L로 캐스팅했습니다.");
		}else {
			System.out.println("kl은 L타입으로 캐스팅이 불가능!!!");
		}
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}
	}

}
