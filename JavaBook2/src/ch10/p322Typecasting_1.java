package ch10;

class E{}
class F extends E{}
class G extends F{}
class H extends F{}

public class p322Typecasting_1 {
	public static void main(String[] args) {
		
		E eg = (E) new G();
		F fg = (F) new G();
		F ff = new F();
		E e = (E) ff;
		
		E ee = new E();
		
		E ef = new F();
		F f = (F) ef;
		
		F fh = new H();
		H h = (H) fh;
		
		E eh = new H();
		F f1 = (F) eh;
		H h1 = (H) eh;
	}

}
