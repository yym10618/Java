package ch07;

class Return{
	
	String getName() {
		return "ȫ�浿";
	}
	
	int getAge() {
		return 30;
	}
}
public class P155 {
	
	public static void main(String[] args) {
		
		Return obj = new Return();
		
		String name = obj.getName();
		int age = obj.getAge();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}

}
