package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : �ڹ� ���� ����� �ǽ� ���� p469
 */
public class Sub1_FileIOTest {
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata\\Desktop\\Test1.txt";
		String path2 = "C:\\Users\\bigdata\\Desktop\\Test2.txt";
		
		try {
			// ���� ��Ʈ���� ����
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				
				// �Է� ��Ʈ������ ������ �б�
				value = fis.read();
				
				if(value == -1) {
					break; // ���̻� ���� �����Ͱ� ���� ��� ����
				}
				
				// ��� ��Ʈ������ ������ ����
				fos.write(value);
			}
			
			// ��Ʈ�� ���� ����
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("���α׷� ����...");
	}
}
