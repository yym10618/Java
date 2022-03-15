package ch07;

class I{
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}
class J{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}
public class p255ThisKeyword_2 {
	public static void main(String[] args) {
		// 필드명과 지역변수명이 같고 this 키워드를 사용하지 않음.
		I i = new I();
		i.init(2, 3);
		System.out.println(i.m);
		System.out.println(i.n);
		// 필드명과 지역변수명이 같고 this 키워드를 사용함.
		J j = new J();
		j.init(2, 3);
		System.out.println(j.m);
		System.out.println(j.n);
	}

}
