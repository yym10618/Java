package ch07;

class Student2 {
	
	//�ʵ�
	String name; // �л���
	int grade; // �г�
	String department; // �а�
	
	// 1�� ������
	Student2(){
		
	}
	
	// 2�� ������
	Student2(String n){
		name = n;
	}

	// 3�� ������
	Student2(String n, int g){
		name = n;
		grade = g;
	}
	
	// 4�� ������
	Student2(String n, int g, String d){
		name = n;
		grade = g;
		department = d;
	}
}

public class P170{
	
	public static void main(String[] args) {
		
		Student2 stu1 = new Student2("ȫ�浿", 4, "����Ʈ�������");
		
		System.out.println(stu1.name);
		System.out.println(stu1.grade);
		System.out.println(stu1.department);
		
		Student2 stu2 = new Student2("�̼���", 3, "������");
		
		System.out.println(stu2.name);
		System.out.println(stu2.grade);
		System.out.println(stu2.department);
		
		// �⺻ �����ڷ� ��ü ����
		Student2 stu0 = new Student2();
		
	}
}
