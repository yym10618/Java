package test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ��¥ : 2022/01/13
 * �̸� : ����
 * ���� : ��Ʈ�� ��������
 */
class Orange implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Orange(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("�� �� : "+price);
	}
}

class ReadObjectTest{
	
	public static void main(String[] args) {
		
		try {
			// ���� ������Ʈ ���� ������ Orange.txt. ��ü���ϰ� ��Ʈ�� ����
			FileInputStream   fis = new FileInputStream("./Orange.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// ��Ʈ���� ���� ��ü�� ����(������ȭ)
			Orange a1 = (Orange) ois.readObject();
			Orange a2 = (Orange) ois.readObject();
			a1.show();
			a2.show();
			
			// ��Ʈ�� ����
			ois.close();
			fis.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("Orange.text ������ �������� �ʽ��ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

public class Ex10 {
	public static void main(String[] args) throws Exception {
		
		Orange Orange1 = new Orange("�ѱ�", 3000);
		Orange Orange2 = new Orange("�̱�", 3000);
		
		FileOutputStream   fos = new FileOutputStream("./Orange.txt");			
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// ���� ������Ʈ ���� ������ Orange.txt ��ü���� ����(����ȭ)
		oos.writeObject(Orange1);
		oos.writeObject(Orange2);
		
		// ��Ʈ�� ����
		oos.close();
		fos.close();
		
		System.out.println("���� ������ Orange.txt ��ü���� ���� �Ϸ�!");
	}	
}
